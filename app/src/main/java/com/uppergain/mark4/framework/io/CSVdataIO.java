package com.uppergain.mark4.framework.io;

import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/**
 * 共通機能<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.3
 * @since 2020-03-01
 */
public class CSVdataIO implements DataIO {
    private static final String TAG = "CSVdataIO";

    //ファイル読み込みで使用する３つのクラス
    private FileInputStream fi = null;
    private InputStreamReader is = null;
    private BufferedReader br = null;
    //対象となるディレクトリ
    String path;
    //ファイル名
    String fileName;

    @Override
    public void set() {
        //読み込みファイルのインスタンス生成
        //ファイル名を指定する
        try {
            fi = new FileInputStream(path);
            is = new InputStreamReader(fi);
            br = new BufferedReader(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean existenceData() {
        return false;
    }

    @Override
    public String reader(String key) {
        return null;
    }

    /**
     * 指定したファイルからデータをすべて読み込む
     *
     * @param path 指定するファイル
     * @return データリスト
     */
    @Override
    public ArrayList<String> getAllElement(String path) {
        Log.d(TAG, "getAllElement: " + path);
        ArrayList<String> list = new ArrayList<>();
        try {
            //列名を管理する為の配列
            String line;
            // 1行ずつCSVファイルを読み込む
            while ((line = br.readLine()) != null) {
                list.add(String.valueOf(line.split("\t", 0))); // 行をタブ区切りで配列に変換
            }
            //コンソールに出力する。
            for (String a : list) {
                System.out.print(a);
            }
            br.close();

        } catch (IOException e) {
            Log.d(TAG, "getAllElement: " + e);
        }
        return list;
    }

    @Override
    public void writer(Map<String, String> saveData) {

    }

    @Override
    public void update(String key, String element) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void execute() {

    }
}
