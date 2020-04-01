package com.uppergain.mark4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * スプラッシュ画面＋TOP画面クラス<br>
 * 基底GoF:-
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-01
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
