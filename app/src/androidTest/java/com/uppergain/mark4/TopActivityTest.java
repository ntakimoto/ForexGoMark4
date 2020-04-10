package com.uppergain.mark4;

import android.Manifest;
import android.content.Context;

import androidx.core.content.ContextCompat;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class TopActivityTest {

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
    public void 異常系_1_1_4_書き込み許諾しない場合アプリキルすること() {
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
    public void 正常系_1_2_7_3秒表示しフェードアウトすること() {
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

    //ログイン・Google会員登録画面
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

    //メールアドレス登録画面
    @Test
    public void 正常系_2_1_20_メールアドレス文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_21_パスワード文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_22_確認用パスワード文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_23_新規登録ボタン() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_24_ダイアログを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    //［新規登録］ボタン押下
    @Test
    public void 正常系_2_1_25_メールアドレス文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 異常系_2_1_26_エラーメッセージを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_27_パスワード文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 異常系_2_1_28_エラーメッセージを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_29_確認用パスワード文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 異常系_2_1_30_エラーメッセージを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    //初期設定画面
    @Test
    public void 正常系_2_1_31_ニックネーム() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_32_初期HP入力() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_33_登録ボタン() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_34_確認画面に遷移すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_35_プリファレンスにニックネームを保存すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_36_プレファレンスに初期HPを保存すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    //入力チェック
    @Test
    public void 正常系_2_1_37_ニックネーム文字列() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_38_エラーメッセージを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_39_数字100000_1000000() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 異常系_2_1_40_エラーメッセージを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    //ログイン確認・初期設定画面
    @Test
    public void 正常系_2_1_41_遷移元に戻ること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 異常系_2_1_42_ダイアログを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_43_バトル画面へ遷移すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 異常系_2_1_44_ダイアログを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_45_FireBaseに登録済みニックネームを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_46_FireBaseにある現在HPを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_47_登録したニックネームを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_48_設定したHPを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    @Test
    public void 正常系_2_1_49_ゲームの進め方についてはYouTubeでご確認ください() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
    }

    //会員登録済
    @Test
    public void 正常系_2_2_1_会員登録済GAMESTARTボタンを表示すること() {
        String actual = null;
        String expected = "";
        assertThat(actual, is(expected));
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