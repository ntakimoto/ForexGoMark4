package com.uppergain.mark4.framework.Decorator;

public class MarginMaintenanceRate extends ItemDecorator {

    Calculation calculation;

    public MarginMaintenanceRate(Calculation calculation){
        this.calculation = calculation;
    }

    @Override
    public String result() {
        //TODO:証拠金維持率 = 時価評価総額 ÷ 必要証拠金 × 100
        return "時価評価総額 ÷ 必要証拠金 × 100";
    }

    @Override
    public String getDescription() {
        return "証拠金維持率:";
    }
}
