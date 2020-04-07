package com.uppergain.mark4;

import android.app.Application;

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
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static ForexGoApp getInstance() {
        return instance;
    }

}
