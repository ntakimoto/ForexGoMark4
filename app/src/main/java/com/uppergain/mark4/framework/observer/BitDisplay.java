package com.uppergain.mark4.framework.observer;

import android.util.Log;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;


public class BitDisplay implements Observer, DisplayElement {
    private static final String TAG = "BitDisplay";

    private BigDecimal bit;

    public BitDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        EntryData entryData = (EntryData) observable;
        if (observable instanceof EntryData) {
            bit = entryData.getBit();
            display();
        }
    }

    @Override
    public void display() {
        Log.d(TAG, "現在売値: " + bit);
    }
}