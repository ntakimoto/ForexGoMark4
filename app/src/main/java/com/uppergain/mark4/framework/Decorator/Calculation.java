package com.uppergain.mark4.framework.Decorator;

public abstract class Calculation {

    String description = "不明な計算";

    public String getDescription(){
        return description;
    }

    public abstract String result();
}
