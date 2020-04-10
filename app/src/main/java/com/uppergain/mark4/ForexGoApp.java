package com.uppergain.mark4;

import android.app.Application;

import com.uppergain.mark4.framework.State.UserState;

import java.util.Date;

/**
 * FirexGo用Applicationクラス<br>
 * 基底GoF:Singlton
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-07
 */
public class ForexGoApp extends Application {

    private static ForexGoApp instance = null;
    private static Date date = new Date();//登録日
    private static UserState state;//会員状態

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static ForexGoApp getInstance() {
        return instance;
    }

    /**
     * システム日時を返す
     * @return 現在のシステム日時
     */
    public Date getDate() {
        return date;
    }

    /**
     * 現在のステータスを一時登録する
     * @param state
     */
    public void setState(UserState state) {
        ForexGoApp.state = state;
    }

    /**
     * 会員ステータスを返す
     * @return 現在の会員ステータス
     */
    public static UserState getState() {
        return state;
    }
}

