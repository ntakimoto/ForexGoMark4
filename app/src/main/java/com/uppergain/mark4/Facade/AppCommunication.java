package com.uppergain.mark4.Facade;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * 通信状況を確認するクラス<br>
 * 基底GoF:Facadeパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-24
 */
public class AppCommunication implements CheckAction {
    private static final String TAG = "AppCommunication";

    private Context context;

    public AppCommunication(Context context) {
        this.context = context;
    }

    @Override
    public void sysCheck() {
        if (!conFlag()) {
            showDialog();
        } else {
            Log.d(TAG, "*********************通信圏内*********************");
        }
    }

    @Override
    public void showDialog() {
        //TODO:showDialog()メッセージ
        Log.d(TAG, "showDialog()メッセージ");
    }

    @Override
    public boolean infoFlag() {
        return false;
    }

    public boolean conFlag() {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info != null) {
            return info.isConnected();
        } else {
            return false;
        }
    }
}
