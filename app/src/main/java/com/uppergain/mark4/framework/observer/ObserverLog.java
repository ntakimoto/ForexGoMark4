package com.uppergain.mark4.framework.observer;

import com.uppergain.mark4.entity.EntryData;

import java.math.BigDecimal;

public class ObserverLog {

    public void run(){

        EntryData entryData = new EntryData();

        ServerTimeDisplay serverTimeDisplay = new ServerTimeDisplay(entryData);
        AskDisplay askDisplay = new AskDisplay(entryData);
        BitDisplay bitDisplay = new BitDisplay(entryData);
        SpreadDisplay spreadDisplay = new SpreadDisplay(entryData);

        entryData.setMeasurements("123456789",new BigDecimal("140.130"),new BigDecimal("140.100"));
    }}
