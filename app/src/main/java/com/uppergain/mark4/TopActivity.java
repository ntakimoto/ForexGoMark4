package com.uppergain.mark4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.uppergain.mark4.framework.State.UserState;
import com.uppergain.mark4.framework.facade.AppPermission;
import com.uppergain.mark4.framework.facade.CheckAction;
import com.uppergain.mark4.framework.facade.GemeStartFacade;
import com.uppergain.mark4.framework.io.DataIO;
import com.uppergain.mark4.framework.io.PrefDataIO;

/**
 * スプラッシュ画面およびTOP画面Activity<br>
 * 基底GoF:-
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-08
 */
//@EActivity(R.layout.activity_top)
public class TopActivity extends AppCompatActivity {
    private static final String TAG = "TopActivity";

    //@ViewById(R.id.new_game)
    private Button newGame;
    //@ViewById(R.id.game_start)
    private Button gameStart;
    private GemeStartFacade facade;
    private CheckAction checkedAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // タイトルバーを非表示
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // ステータスバーを非表示
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_top);

        //1_0_0_パーミッション許諾処理
        checkedAction = new AppPermission(this);
        checkedAction.sysCheck();

        //1_2_7_スプラッシュ画面表示
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new SplashFragment()).commit();
        //1_2_8_3秒後、TOP画面に自動遷移する
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        //2_0_0_背景画像表示
        //x_x_x_サウンド再生

        //ボタン表示分岐処理
        newGame = findViewById(R.id.new_game);
        gameStart = findViewById(R.id.game_start);

        DataIO io = new PrefDataIO();
        //プレファレンスファイルを確認
        String prefData = io.reader(getPackageName()+"_preferences.xml");
        //2_0_1_ボタン表示判定
        if (prefData == null) {//ファイルが存在しない場合
            new UserState("0");
            Log.d(TAG, "[NEW GAME］ボタンを表示すること[ド新規]");
            gameStart.setVisibility(View.INVISIBLE);
        } else if (prefData.equals("0")) {//会員テータスが0である場合
            Log.d(TAG, "[NEW GAME］ボタンを表示すること[既存]");
            gameStart.setVisibility(View.INVISIBLE);
        } else {//それ以外の場合
            new UserState(prefData);
            Log.d(TAG, "[GAME START]ボタンを表示すること");
            newGame.setVisibility(View.INVISIBLE);
        }

        final Intent intent = new Intent(this, MainActivity.class);
        //[NEW GAME］ボタンを押下した場合
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isCon = ForexGoApp.getCommunication().conFlag();
                if (!isCon) {
                    ForexGoApp.getCommunication().showMsg();
                } else {
                    Log.d(TAG, "[NEW GAME]: Google登録画面へ遷移する");
                    startActivity(intent);
                    finish();
                    //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag, new RegisterGoogleFragment()).commit();
                }
            }
        });

        //[GAME START]ボタンを押下した場合
        gameStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean isCon = ForexGoApp.getCommunication().conFlag();
                if (!isCon) {
                    ForexGoApp.getCommunication().showMsg();
                } else {
                    Log.d(TAG, "[GAME START]: バトル画面へ遷移する");
                    //Intent intent = new Intent(this, MainActivity.class);
                    //startActivity(intent);
                    //一連の処理が動作する
                    facade = new GemeStartFacade();
                    facade.startGeme();
                }
            }
        });
    }
}
