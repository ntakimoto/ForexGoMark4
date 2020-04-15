package com.uppergain.mark4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.uppergain.mark4.control.UserInfo;
import com.uppergain.mark4.framework.State.UserState;
import com.uppergain.mark4.framework.facade.CheckAction;
import com.uppergain.mark4.framework.facade.GemeStartFacade;

/**
 * TOP画面Activity<br>
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
        // ステータスバーを非表示
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //2_0_0_背景画像表示
        setContentView(R.layout.activity_top);

        //x_x_x_サウンド再生

        //ボタン表示分岐処理
        newGame = findViewById(R.id.new_game);
        gameStart = findViewById(R.id.game_start);

        UserInfo io = new UserInfo();
        //プレファレンスファイルを確認
        String prefData = io.getUserStatus();
        //2_0_1_ボタン表示判定
        if (prefData == null) {//ファイルが存在しない場合
            new UserState(prefData);
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

        final Intent intent2 = new Intent(this, MainActivity.class);
        //[GAME START]ボタンを押下した場合
        gameStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean isCon = ForexGoApp.getCommunication().conFlag();
                if (!isCon) {
                    ForexGoApp.getCommunication().showMsg();
                } else {
                    Log.d(TAG, "[GAME START]: バトル画面へ遷移する");
                    startActivity(intent2);
                    finish();
                    //一連の処理が動作する
                    facade = new GemeStartFacade();
                    facade.startGeme();
                }
            }
        });
    }
}
