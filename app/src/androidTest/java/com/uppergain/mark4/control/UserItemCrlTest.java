package com.uppergain.mark4.control;

import com.uppergain.mark4.Entity.ItemDetails;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(Enclosed.class)
public class UserItemCrlTest {

    public static class ファイル読み込み系 {

        UserItemCrl sut;
        Map<String, ItemDetails> item;
        ItemDetails value;

        @Before
        public void setUp() throws Exception {
            sut = new UserItemCrl();
            this.item = new HashMap<>();
            // 1つ目
            String key = "はぐれメタルの剣";
            this.value = new ItemDetails();
            value.setType(0);
            value.setItemName(key);
            value.setPrice(10000);
            value.setQuantity(1);
            value.setEffect(1.5);
            value.setExplanation("メタル系スライムに必ずダメージを与える");
            item.put(key, value);
            // アイテム追加
            sut.add("user_item",item);

            // 2つ目
            String key2 = "キングメタルの鎧";
            this.value = new ItemDetails();
            value.setType(1);
            value.setItemName(key2);
            value.setPrice(50000);
            value.setQuantity(1);
            value.setEffect(1.5);
            value.setExplanation("最強の鎧。めちゃくちゃ硬い。");
            item.put(key2, value);
            // アイテム追加
            sut.add("user_item",item);
        }

        @Test
        public void Case001_Yamlファイルを読み込む() {
            String actual = "はぐれメタルの剣";// 事前準備
            this.item = (Map<String, ItemDetails>) sut.getItemMapList();
            ItemDetails details = item.get("はぐれメタルの剣");
            String expected = details.getItemName();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case002_引数に指定した保有アイテム情報を返す() {
            String actual = "メタル系スライムに必ずダメージを与える";// 事前準備
            ItemDetails details = sut.getBuyItem("はぐれメタルの剣");
            String expected = details.getExplanation();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case003_保有するアイテム数を返す() {
            int actual = 2;// 事前準備
            int expected = sut.counter();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case004_ユーザの所有金額を返す() {
            int actual = 60000;// 事前準備
            int expected = sut.getUserMoney();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case005_ユーザの所有金額を返す() {
            int actual = 60000;// 事前準備
            int expected = sut.getUserMoney();// 実行
            assertThat(actual, is(expected));// 検証
        }
    }



    public static class FireBase接続系 {

        UserItemCrl sut;
        Map<String, ItemDetails> item;

        @Before
        public void setUp() throws Exception {
            sut = new UserItemCrl();
            this.item = new HashMap<>();
        }

        @Test
        public void Case001_選択したアイテムをショップに出品する() {
            String actual = null;// 事前準備
            String expected = null;// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case002_ショップにある選択したアイテムの金額を取得する() {
            int actual = 10000;// 事前準備
            int expected = sut.getItemPrice("はぐれメタルの剣");// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case003_ショップにある選択したアイテムの金額を支払う() {
            int actual = 0;// 事前準備
            int expected = sut.paymetPrice();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case004_FireBaseに接続可能か確認する() {
            boolean actual = false;// 事前準備
            boolean expected = sut.isConFireBase();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case005_ユーザが選択したアイテムが存在する且つユーザアイテムの所有金額がアイテム金額以上である() {
            boolean actual = true;// 事前準備
            boolean expected = sut.isCanBuy("はぐれメタルの剣");// 実行
            assertThat(actual, is(expected));// 検証
        }
    }}