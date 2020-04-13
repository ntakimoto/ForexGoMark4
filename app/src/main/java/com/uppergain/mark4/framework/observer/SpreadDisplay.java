package com.uppergain.mark4.framework.observer;

import android.util.Log;

import com.uppergain.mark4.entity.EntryData;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class SpreadDisplay implements Observer, DisplayElement {
    private static final String TAG = "SpreadDisplay";

    private BigDecimal spread;

    public SpreadDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        EntryData entryData = (EntryData) observable;
        if (observable instanceof EntryData) {
            spread = (entryData.getAsk().subtract(entryData.getBit())).multiply(BigDecimal.valueOf(100));
            display();
        }
    }

    @Override
    public void display() {
        Log.d(TAG, "現在スプレッド: " + spread);
    }
}