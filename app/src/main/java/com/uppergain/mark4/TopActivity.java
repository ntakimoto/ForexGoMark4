package com.uppergain.mark4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
public class TopActivity extends AppCompatActivity {
    private static final String TAG = "TopActivity";

    private Button newGame;
    private Button gameStart;
    private GemeStartFacade facade;
    private CheckAction checkedAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        //1_0_0_パーミッション許諾処理
        checkedAction = new AppPermission(this);
        checkedAction.sysCheck();

        //1_2_7_スプラッシュ画面表示
        //1_2_8_3秒後、TOP画面に自動繊維する
        //2_0_0_背景画像表示
        //x_x_x_サウンド再生

        //ボタン表示分岐処理
        newGame = findViewById(R.id.new_game);
        gameStart = findViewById(R.id.game_start);

        DataIO io = new PrefDataIO();
        //プレファレンスファイルを確認
        String prefData = io.reader("USER_STATUS");
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
            //通信チェック
            ForexGoApp.getCommunication();
            //一連の処理が動作する
            facade = new GemeStartFacade();
            facade.startGeme();
        }
    }
}
