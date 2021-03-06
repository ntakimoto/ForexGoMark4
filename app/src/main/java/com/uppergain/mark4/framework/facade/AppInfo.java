package com.uppergain.mark4.framework.facade;

import android.util.Log;

/**
 * 運営からのお知らせを確認するクラス<br>
 * 基底GoF:Facadeパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-24
 */
public class AppInfo implements CheckAction {
    private static final String TAG = "AppInfo";

    private AppCommunication appCommunication;

    @Override
    public void sysCheck() {
        Log.d(TAG, "sysCheck: 管理人からのお知らせを表示します");
        if(infoFlag()){
            showMsg();
        }
    }

    @Override
    public void showMsg() {
        //FireBase情報取得
    }

    @Override
    public boolean infoFlag() {
        return false;
    }

}
