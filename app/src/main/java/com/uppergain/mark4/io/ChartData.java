package com.uppergain.mark4.io;

import android.content.Context;
import android.util.Log;

import com.uppergain.mark4.ForexGoApp;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * 各通貨ペアにおけるチャートデータを作成する<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-03-07
 */
public class ChartData {
    private static final String TAG = "ChratData";

    //通貨ペアフォルダ
    private String dir;
    CSVdataIO csVdataIO;
    Context context = ForexGoApp.getInstance().getApplicationContext();

    public ChartData(String pair, String axis) {
        csVdataIO = new CSVdataIO();
        File cacheFile = new File(context.getCacheDir().toString());
        this.dir = cacheFile.getPath() + "/" + pair;
        switch (axis) {
            case "1"://1分足
                csVdataIO.fileName = pair + "_0001.csv";
                break;
            case "5"://5分足
                csVdataIO.fileName = pair + "_0005.csv";
                break;
            case "15"://15分足
                csVdataIO.fileName = pair + "_0015.csv";
                break;
            case "30"://30分足
                csVdataIO.fileName = pair + "_0030.csv";
                break;
            case "60"://1時間足
                csVdataIO.fileName = pair + "_0060.csv";
                break;
            case "240"://4時間足
                csVdataIO.fileName = pair + "_0240.csv";
                break;
            case "1440"://日足
                csVdataIO.fileName = pair + "_1440.csv";
                break;
            case "1W"://週足
                csVdataIO.fileName = pair + "_1W.csv";
                break;
            case "1M"://月足
                csVdataIO.fileName = pair + "_1M.csv";
                break;
        }
        csVdataIO.path = dir + "/" + csVdataIO.fileName;
        Log.d(TAG, "ChratDataPath: " + csVdataIO.path);
        //csVdataIO.set();
    }

    public ArrayList getChartDataList() {
        return csVdataIO.getAllElement(csVdataIO.path);
    }

    public void setPriceData() {
        //取得したCSVを取得
        ArrayList priceList = getChartDataList();
        //オブジェクトへ変換準備
        ArrayList<Price> priceDataList = new ArrayList<>();

        String DATANING;
        String TIME;
        String TIMESTAMP;

        //取得した分繰り返す　→　Price1つで一本足
        for (int i = 0; i < priceList.size(); i++) {

            //日付と時間を統合し、タイムスタンプに変換
            DATANING = (String) priceList.get(0);
            TIME = (String) priceList.get(1);
            TIMESTAMP = DATANING + " " + TIME;

            Price price = new Price(
                    new Timestamp((Long) priceList.get(0)),
                    new BigDecimal(String.valueOf(priceList.get(2))),
                    new BigDecimal(String.valueOf(priceList.get(3))),
                    new BigDecimal(String.valueOf(priceList.get(4))),
                    new BigDecimal(String.valueOf(priceList.get(5))),
                    priceList.get(6).toString(),
                    priceList.get(7).toString(),
                    priceList.get(8).toString(),
                    dir
            );
            //一本足分を格納
            priceDataList.add(price);
        }


    }
}
