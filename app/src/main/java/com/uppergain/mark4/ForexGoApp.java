package com.uppergain.mark4;

import android.app.Application;

import com.uppergain.mark4.framework.State.UserState;
import com.uppergain.mark4.framework.facade.AppCommunication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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
    private static UserState state;//会員状態
    public static AppCommunication communication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        communication = new AppCommunication(this);
    }

    public static ForexGoApp getInstance() {
        return instance;
    }

    /**
     * システム日時を返す
     * @return 現在のシステム日時
     */
    public static String getDate() {
        Date date = new Date();//登録日;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(date);
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

    /**
     * 通信チェック処理
     * @return
     */
    public static AppCommunication getCommunication() {
        return communication;
    }

    /**
     * ユーザシーケンス発行し、その値を返す
     */
    public static String getCreatedUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        return str.substring(24, 34);
    }
}

