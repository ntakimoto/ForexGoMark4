package com.uppergain.mark4.framework.Decorator;

public class Gross extends ItemDecorator {

    Calculation calculation;

    public Gross(Calculation calculation){
        this.calculation = calculation;
    }

    @Override
    public String result() {
        return "リスト損益を合計する";
    }

    @Override
    public String getDescription() {
        return "ポジ損益総額:";
    }
}
