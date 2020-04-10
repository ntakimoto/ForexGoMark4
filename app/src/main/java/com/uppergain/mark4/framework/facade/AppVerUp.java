package com.uppergain.mark4.framework.facade;

import android.util.Log;

/**
 * 最新バージョンアップ諾クラス<br>
 * 基底GoF:Facadeパターン
 *
 * @author Natsumi Takimoto
 * @version 0.0.1
 * @since 2020-02-24
 */
public class AppVerUp implements CheckAction {
    private static final String TAG = "AppVerUp";

    AppCommunication appCommunication;

    @Override
    public void sysCheck() {
        Log.d(TAG, "sysCheck: 新しいバージョンの有無を確認します");
        //TODO:通信チェック
        if(infoFlag()){
            showMsg();
        }
    }

    @Override
    public void showMsg() {
        //ストア情報を取得
    }

    @Override
    public boolean infoFlag() {
        return false;
    }
}
