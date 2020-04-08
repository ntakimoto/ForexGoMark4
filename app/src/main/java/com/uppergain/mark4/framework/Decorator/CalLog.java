package com.uppergain.mark4.framework.Decorator;

import android.util.Log;

public class CalLog {
    private static final String TAG = "CalLog";

    public void run() {
        //エントリー枚数を設定
        //Singleton.getInstance().setLot("1.15");

        //1ポジションの損益金額を表示する
        Calculation calculation = new EntryData();
        calculation = new ProfitAndLoss(calculation);
        double i = Double.parseDouble(calculation.result());
        int ii = (int)i;//int型にキャスト
        Log.d(TAG, "run: " + calculation.getDescription() + ii + "円");

        calculation = new MarginMaintenanceRate(calculation);
        Log.d(TAG, "run: " + calculation.getDescription() + calculation.result());

        calculation = new Gross(calculation);
        Log.d(TAG, "run: " + calculation.getDescription() + calculation.result());

    }
}
