package com.uppergain.mark4;

import android.Manifest;
import android.content.Context;
import android.content.res.Resources;

import androidx.core.content.ContextCompat;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.platform.app.InstrumentationRegistry;

import com.uppergain.mark4.control.UserInfo;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

//@RunWith(AndroidJUnit4.class)
@RunWith(Enclosed.class)
public class TopActivityTest {

    public static class 初回起動 {

        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();

        @Before
        public void setUp() throws Exception {

        }

        @Test
        public void 正常系_0_0_0_テスト対象アプリケーションのパッケージ名を取得する() {
            assertEquals("com.uppergain.mark4", context.getPackageName());
        }

        @Test
        public void 正常系_1_1_1_書き込み許諾済みであること() {
            int actual = 0;
            int expected = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE);
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_1_1_2_書き込み許諾しない場合アプリキルすること() {
            String actual = null;//アプリが起動していない
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_1_1_3_読み込み許諾済みであること() {
            int actual = 0;
            int expected = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE);
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_1_1_4_読み込み許諾しない場合アプリキルすること() {
            String actual = null;//アプリが起動していない
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_1_1_5_インターネット接続許諾済みであること() {
            int actual = 0;
            int expected = ContextCompat.checkSelfPermission(context, Manifest.permission.INTERNET);
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_1_1_6_インターネット接続許諾しない場合アプリキルすること() {
            String actual = null;//アプリが起動していない
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_1_2_7_スプラッシュ画面を表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_1_2_8_トップ画面に遷移すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_0_1_プレファレンスファイルが存在すること() {
            String actual = "USER_INFO.xml";
            String expected = null;
            File dir = new File("/data/data/" + context.getPackageName() + "/shared_prefs/");
            File[] list = dir.listFiles();
            for (int i = 0; i < list.length; i++) {
                expected = list[i].getName();
            }
            assertThat(actual, is(expected));
        }

    }

    public static class 初回起動以降 {
        //Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        private Context context = ApplicationProvider.getApplicationContext();
        UserInfo sut;

        @Before
        public void setUp() throws Exception {
            sut = new UserInfo();
        }

        @Test
        public void 正常系_2_0_1_会員ステータスが0である() {
            String actual = "0";// 事前準備
            sut.updataData("0");
            String expected = sut.getUserStatus();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void 正常系_2_2_1_会員登録済NEWGAMEボタンを表示すること() {
            Resources res = context.getResources();
            int actual = R.id.new_game;
            int expected = res.getIdentifier("new_game", "id", context.getPackageName());
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_0_1_会員ステータスが1である() {
            String actual = "1";
            sut.updataData("1");
            String expected = sut.getUserStatus();
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_1_会員登録済GAMESTARTボタンを表示すること() {
            Resources res = context.getResources();
            int actual = R.id.game_start;
            int expected = res.getIdentifier("game_start", "id", context.getPackageName());
            assertThat(actual, is(expected));
        }

    }

    public static class 会員登録済 {
        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();

        @Before
        public void setUp() throws Exception {

        }

        @Test
        public void 正常系_2_2_2_一連の処理が動作すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_2_2_3_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_4_Versionチェック() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_5_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_6_ダイアログを閉じること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_7_ストア画面へ遷移すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_8_運営情報の有無チェック() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_9_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_10_ダイアログを閉じること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_11_メンテナンス情報有無チェック() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_12_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_13_ダイアログを閉じること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_14_バトル画面へ遷移すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_2_2_15_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_2_16_バトル画面へ遷移すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }
    }
}