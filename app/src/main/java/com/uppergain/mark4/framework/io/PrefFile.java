package com.uppergain.mark4.framework.io;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.uppergain.mark4.ForexGoApp;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;

/**
 * プレファレンス関連操作クラス<br>
 * 基底GoF:Strategy
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-13
 */
public class PrefFile implements DataIO, FileIO {

    SharedPreferences prefer;
    Context context = ForexGoApp.getInstance().getApplicationContext();

    public PrefFile() {
        prefer = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /**
     * すべての値を取得する処理
     *
     * @param target 指定するプレファレンスファイル名
     * @return SharedPreferencesに登録してあるすべての値
     */
    @Override
    public Object readData(String target) {
        SharedPreferences pref = (SharedPreferences) this.readFile(target);
        //すべての値を取得する
        Object obj = pref.getAll();
        return obj;
    }

    /**
     * 会員種別を取得する処理
     *
     * @param target 指定するSharedPreferencesファイル名
     * @return 会員種別
     */
    public String getUserStatus(String target) {
        SharedPreferences pref = (SharedPreferences) this.readFile(target);
        //第１引数にはキー値を、第２引数にはそのキーが存在しない場合の戻り値を、指定する。
        String userStatus = pref.getString("USER_STATUS", null);
        return userStatus;
    }

    /**
     * ユーザSEQを取得する処理
     *
     * @param target 指定するSharedPreferencesファイル名
     * @return ユーザSEQ
     */
    public String getUserSeq(String target) {
        SharedPreferences pref = (SharedPreferences) this.readFile(target);
        //第１引数にはキー値を、第２引数にはそのキーが存在しない場合の戻り値を、指定する。
        String userStatus = pref.getString("USER_SEQ", null);
        return userStatus;
    }

    /**
     * 初回起動日を取得する処理
     *
     * @param target 指定するSharedPreferencesファイル名
     * @return 初回起動日
     */
    public String getRegisterDate(String target) {
        SharedPreferences pref = (SharedPreferences) this.readFile(target);
        //第１引数にはキー値を、第２引数にはそのキーが存在しない場合の戻り値を、指定する。
        String userStatus = pref.getString("REGISTER_DATE", null);
        return userStatus;
    }

    /**
     * ユーザ情報を更新する
     *
     * @param key 指定するSharedPreferencesファイル名
     * @param newData 更新値
     * @return
     */
    @Override
    public Object updateData(String key, Object newData) {
        deleteData("USER_INFO");
        String value = (String) newData;
        SharedPreferences pref = (SharedPreferences) this.readFile("USER_INFO");
        pref.edit().putString(key,value).apply();
        Object obj = "ユーザー情報が更新されました。";
        return obj;
    }

    @Override
    public void deleteData(String targetData) {
        SharedPreferences pref = (SharedPreferences) this.readFile(targetData);
        pref.edit().remove("USER_STATUS").apply();
    }

    @Override
    public int counter() {
        return 0;
    }

    /**
     * プレファレンスへ書き込み処理
     *
     * @param target ファイル名
     * @param data   <XMLタグ,値>
     */
    @Override
    public void makeFile(String target, Object data) {
        boolean isFile = this.isTargetFile(target);
        if (!isFile) {//ファイルが存在しない場合
            //ファイル名・書き込みモードを指定する
            prefer = context.getSharedPreferences(target, MODE_PRIVATE);
            //Object型をキャスト
            Map<String, String> saveData = (Map<String, String>) data;
            Iterator<Map.Entry<String, String>> itr = saveData.entrySet().iterator();
            // key, valueの取得
            while (itr.hasNext()) {
                // nextを使用して値を取得する
                Map.Entry<String, String> entry = itr.next();
                prefer.edit().putString("" + entry.getKey(), "" + entry.getValue()).apply();
            }
        }
    }

    /**
     * 対象となるファイルが存在有無判定
     *
     * @param target 対象ファイル名
     * @return 対象ファイルの有無
     */
    public boolean isTargetFile(String target) {
        String path = "/data/data/" + context.getPackageName() + "/shared_prefs/" + target + ".xml";
        File file = new File(path);
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object readFile(String target) {
        prefer = context.getSharedPreferences(target, 0);
        Object obj = prefer;
        return obj;
    }

    @Override
    public Object updateFile(String key, Object newData) {
        return null;
    }

    @Override
    public void deleteFile(String targetData) {

    }
}
