package com.uppergain.mark4.framework.Command.Client;

import android.util.Log;

public class Monster {
    private static final String TAG = "Monster";

    public Monster(){}

    public void viewInfo(){
        Log.d(TAG, "viewInfo: モンスター情報の詳細を表示します");
        //TODO:[Command]モンスター画像長押しでダイアログを表示する
    }
}
