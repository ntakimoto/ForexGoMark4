package com.uppergain.mark4.framework.observer;

import android.util.Log;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class AskDisplay implements Observer,DisplayElement {
    private static final String TAG = "AskDisplay";

    private BigDecimal ask;

    public AskDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        EntryData entryData = (EntryData) observable;
        if (observable instanceof EntryData) {
            ask = entryData.getAsk();
            display();
        }
    }

    @Override
    public void display() {
        Log.d(TAG, "現在買値: " + ask);
    }
}
