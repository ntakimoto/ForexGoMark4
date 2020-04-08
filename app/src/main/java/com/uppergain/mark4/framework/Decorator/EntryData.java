package com.uppergain.mark4.framework.Decorator;

import java.math.BigDecimal;

public class EntryData extends Calculation {

    public EntryData() {
        description = "計算項目のデータ群";
    }

    @Override
    public String result() {
        //結果を返す
        return null;
    }

    public String getEntryType() {
        //計算対象のロング・ショート判定
        return "Bit";
    }

    public String currencyPair() {
        //通貨ペア
        return null;
    }

    public BigDecimal entryAsk() {
        //現在のロング価格
        return new BigDecimal("140.100");
    }

    public BigDecimal entryBit() {
        //現在のショート価格
        return new BigDecimal("140.200");
    }

    public BigDecimal getJPYAsk() {
        //現在のJPY価格［ロング］
        return new BigDecimal("100.000");
    }

    public String getTimeStamp() {
        //現在のサーバータイムスタンプ
        return null;
    }

    /**
     * 獲得pipsの計算結果を返す。
     *
     * @return 獲得pips
     */
    public BigDecimal pips() {
        String entryType = getEntryType();
        BigDecimal pips;

        if (entryType.equals("Ask")) {
            pips = entryBit().subtract(entryAsk());
            return pips.multiply(new BigDecimal("100"));
        } else if (entryType.equals("Bit")) {
            pips = entryAsk().subtract(entryBit());
            return pips.multiply(new BigDecimal("100"));
        }
        return null;
    }

}
