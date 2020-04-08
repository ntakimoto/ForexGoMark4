package com.uppergain.mark4.framework.Command.Client;

import android.util.Log;

public class Display {
    private static final String TAG = "Display";

    public Display(){}

    public void locked(){
        //TODO:[Command]ロックボタン長押しで画面をロック→シングルトンを利用
        //Singleton.getInstance().setDisplay(false);
        Log.d(TAG, "locked: 画面をロックしました");
    }

    public void unlocked(){
        //TODO:[Command]ロックボタン長押しで画面をアンロックする→シングルトンを利用
        //Singleton.getInstance().setDisplay(true);
        Log.d(TAG, "unlocked: 画面ロックを解除しました");
    }
}
