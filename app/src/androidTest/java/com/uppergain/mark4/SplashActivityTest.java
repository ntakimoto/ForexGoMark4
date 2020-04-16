package com.uppergain.mark4;

import android.Manifest;
import android.content.Context;

import androidx.core.content.ContextCompat;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class SplashActivityTest {

    public static class パーミッション許諾関連 {

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
}