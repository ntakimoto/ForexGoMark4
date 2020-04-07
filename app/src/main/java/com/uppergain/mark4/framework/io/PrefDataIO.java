package com.uppergain.mark4.framework.io;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.uppergain.mark4.ForexGoApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * 共通機能［プレファレンス］クラス<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-22
 */
public class PrefDataIO implements DataIO {
    private static final String TAG = "PrefDataIO";

    SharedPreferences prefer;
    Context context = ForexGoApp.getInstance().getApplicationContext();

    public PrefDataIO() {
        set();
    }

    /**
     * ContextからPreferenceManagerを取得し、セットする
     */
    @Override
    public void set() {
        prefer = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public boolean existenceData() {
        return false;
    }

    /**
     * プレファレンスから読み込む処理
     *
     * @param key 対象となるタグ
     */
    @Override
    public String reader(String key) {
        return prefer.getString(key, null);
    }

    @Override
    public ArrayList<String> getAllElement(String key) {
        return null;
    }

    /**
     * プレファレンスへ書き込み処理
     *
     * @param saveData プレファレンス保存データ
     */
    @Override
    public void writer(Map<String, String> saveData) {
        Iterator<Map.Entry<String, String>> itr = saveData.entrySet().iterator();
        // key, valueの取得
        while (itr.hasNext()) {
            // nextを使用して値を取得する
            Map.Entry<String, String> entry = itr.next();
            prefer.edit().putString("" + entry.getKey(), "" + entry.getValue()).apply();
            Log.d(TAG, entry.getKey() + " : " + entry.getValue());
        }
    }

    @Override
    public void update(String key, String element) {

    }

    @Override
    public void elete(String key) {

    }

    @Override
    public void execute() {

    }

}
