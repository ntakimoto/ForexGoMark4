package com.uppergain.mark4.framework.facade;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/**
 * パーミッション許諾クラス<br>
 * 基底GoF:Facadeパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-24
 */
public class AppPermission implements CheckAction {
    private static final String TAG = "AppPermission";

    private Context context;

    public AppPermission(Context context){
        this.context = context;
    }

    @Override
    public void sysCheck() {
        Log.d(TAG, "sysCheck: パーミッション許諾実施");
        int readCheck = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE);
        int writeCheck = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int netConnectCheck = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_NETWORK_STATE);

        // ユーザーはパーミッションを許可していない
        if (readCheck != PackageManager.PERMISSION_GRANTED) {
            Log.d(TAG, "許諾実施: ストレージ読み込み許諾");
            ActivityCompat.requestPermissions(
                    (Activity) context,
                    new String[] { Manifest.permission.READ_EXTERNAL_STORAGE }, 1);
        }
        if (writeCheck != PackageManager.PERMISSION_GRANTED){
            Log.d(TAG, "許諾実施: ストレージ書き込み許諾");
            ActivityCompat.requestPermissions(
                    (Activity) context,
                    new String[] { Manifest.permission.WRITE_EXTERNAL_STORAGE }, 2);
        }
        if (netConnectCheck != PackageManager.PERMISSION_GRANTED){
            Log.d(TAG, "許諾実施: インターネット接続許諾");
            ActivityCompat.requestPermissions(
                    (Activity) context,
                    new String[] { Manifest.permission.ACCESS_NETWORK_STATE }, 3);
        }
    }

    @Override
    public void showDialog() { }

    @Override
    public boolean infoFlag() {
        return false;
    }


}
