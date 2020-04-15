package com.uppergain.mark4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.uppergain.mark4.framework.facade.AppPermission;
import com.uppergain.mark4.framework.facade.CheckAction;

/**
 * スプラッシュ画面Activity<br>
 * 基底GoF:-
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-16
 */
public class SplashActivity extends AppCompatActivity {

    private CheckAction checkedAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ステータスバーを非表示
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //1_2_7_スプラッシュ画面表示
        setContentView(R.layout.activity_splash);

        //1_0_0_パーミッション許諾処理
        checkedAction = new AppPermission(this);
        checkedAction.sysCheck();

        //1_2_8_3秒後、TOP画面に自動遷移する
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, TopActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        }, 3000);
    }
}
