package com.uppergain.mark4.framework.Decorator;

public abstract class UnknownPosition {

    String unknownPair;
    String lots;

    //通貨ペアを返す
    String getPair() {
        return unknownPair;
    }

    //取引枚数を返す
    String getLot() {
        int l = Integer.parseInt(this.lots);
        String sl = ""+ l * 100000;
        return sl;
    }

    //計算結果
    public abstract int result();
    
}
