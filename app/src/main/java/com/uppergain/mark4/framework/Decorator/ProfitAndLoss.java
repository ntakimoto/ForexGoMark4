package com.uppergain.mark4.framework.Decorator;

import java.math.BigDecimal;

public class ProfitAndLoss extends ItemDecorator {

    Calculation calculation;
    EntryData entryData;
    EntryLot entryLot;

    public ProfitAndLoss(Calculation calculation) {
        this.calculation = calculation;
        this.entryData = new EntryData();
        this.entryLot = new EntryLot();
    }

    /**
     * 1ポジションに対する損益金額の計算結果を返す
     * 損益 = 獲得pips × 取引数量 × 円換算レート
     *
     * @return 損益
     */
    @Override
    public String result() {
        BigDecimal r1;
        BigDecimal r2;
        r1 = entryData.pips().multiply(entryData.getJPYAsk());
        BigDecimal lot = BigDecimal.valueOf(Double.parseDouble(entryLot.result())).multiply(new BigDecimal("10"));
        r2 = r1.multiply(lot);
        return "" + r2;
    }

    @Override
    public String getDescription() {
        return "ポジ損益金額:";
    }
}
