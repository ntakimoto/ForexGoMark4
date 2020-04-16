package com.uppergain.mark4.ui.fragment;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//@RunWith(AndroidJUnit4.class)
@RunWith(Enclosed.class)
public class RegisterGoogleFragmentTest {

    Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();

    @Before
    public void setUp() throws Exception {
    }

    public static class 既存会員がログイン {

        @Before
        public void setUp() throws Exception {
        }

        @Test
        public void 異常系_2_1_9_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_1_10_EditTextに入力された値を取得しFireBaseを参照する() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_1_11_メールアドレス文字列() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_2_1_12_エラーメッセージを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_1_13_パスワード文字列() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 異常系_2_1_14_エラーメッセージを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }
    }
    public static class Googleアカウントで新規登録 {

        @Before
        public void setUp() throws Exception {
        }

        @Test
        public void 正常系_2_1_15_Googleアカウントボタンを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_1_16_端末に登録してあるアカウント一覧を表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        //Google会員登録
        @Test
        public void 異常系_2_1_17_ダイアログを表示すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_1_18_ダイアログが表示されFireBaseにアカウント情報が登録されること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }

        @Test
        public void 正常系_2_1_19_新規登録画面メールアドレスに遷移すること() {
            String actual = null;
            String expected = "";
            assertThat(actual, is(expected));
        }
    }
}