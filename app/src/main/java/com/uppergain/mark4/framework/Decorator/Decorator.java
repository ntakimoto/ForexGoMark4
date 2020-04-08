package com.uppergain.mark4.framework.Decorator;

public abstract class Decorator extends UnknownPosition {

    public abstract String getPosition();
    public abstract String getAskEntry();
    public abstract String getBitEntry();
    public abstract String getJPYAsk();
    public abstract String getEntryType();
    

    //TODO:スプレッドを計算する
    //TODO:証拠金維持率=時価評価総額÷必要証拠金×100
    //TODO:損益 = 獲得pips × 取引数量 × 円換算レート
    //TODO:最低証拠金＝取引金額÷レバレッジ

}
