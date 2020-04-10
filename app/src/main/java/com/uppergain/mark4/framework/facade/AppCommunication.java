package com.uppergain.mark4.framework.facade;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

import com.uppergain.mark4.R;

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
            showMsg();
        } else {
            Log.d(TAG, "*********************通信圏内*********************");
        }
    }

    @Override
    public void showMsg() {
        Toast toast = Toast.makeText(context, R.string.out_of_service_area, Toast.LENGTH_SHORT);
        toast.show();
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
