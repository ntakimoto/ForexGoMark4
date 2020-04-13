package com.uppergain.mark4.entity;

import java.math.BigDecimal;
import java.util.Observable;

public class EntryData extends Observable {

    private String timeStamp;
    private BigDecimal ask;
    private BigDecimal bit;

    public EntryData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(String timeStamp, BigDecimal ask, BigDecimal bit){
        this.timeStamp = timeStamp;
        this.ask = ask;
        this.bit = bit;
        measurementsChanged();
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public BigDecimal getBit() {
        return bit;
    }
}
