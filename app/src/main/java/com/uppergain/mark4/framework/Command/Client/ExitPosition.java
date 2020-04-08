package com.uppergain.mark4.framework.Command.Client;

import android.util.Log;

public class ExitPosition {
    private static final String TAG = "ExitPosition";

    public ExitPosition(){}

    public void delete(){
        Log.d(TAG, "delete: ポジションを削除しまました");
        //TODO:[Command]FireBaseにあるポジションを削除する
        //TODO:[Command]決済した履歴をローカルDBに保存する
    }
}
