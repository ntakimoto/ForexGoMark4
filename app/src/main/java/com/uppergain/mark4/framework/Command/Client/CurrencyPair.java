package com.uppergain.mark4.framework.Command.Client;

import android.util.Log;

public class CurrencyPair {
    private static final String TAG = "CurrencyPair";

    public CurrencyPair(){}

    public void switched(){
        //TODO:[Command]通貨ペアを切り替える
        Log.d(TAG, "switched: 通貨ペアを切り替えました");
    }
}
