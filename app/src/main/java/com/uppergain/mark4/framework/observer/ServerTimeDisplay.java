package com.uppergain.mark4.framework.observer;

import android.util.Log;

import com.uppergain.mark4.entity.EntryData;

import java.util.Observable;
import java.util.Observer;

public class ServerTimeDisplay implements Observer, DisplayElement {
    private static final String TAG = "ServerTimeDisplay";

    private String timeStamp;

    public ServerTimeDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        EntryData entryData = (EntryData) observable;
        if (observable instanceof EntryData) {
            timeStamp = entryData.getTimeStamp();
            display();
        }
    }

    @Override
    public void display() {
        Log.d(TAG, "サーバータイムスタンプ: " + timeStamp);
    }
}