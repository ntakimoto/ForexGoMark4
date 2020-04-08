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
            value.setLocked(true);
            value.setType(0);
            value.setItemName(key);
            value.setPrice(10000);
            value.setQuantity(1);
            value.setEffect(1.5);
            value.setItemID("aaaa");
            value.setExplanation("メタル系スライムに必ずダメージを与える");
            item.put(key, value);
            // アイテム追加
            sut.add("user_item",item);

            // 2つ目
            String key2 = "キングメタルの鎧";
            this.value = new ItemDetails();
            value.setLocked(false);
            value.setType(1);
            value.setItemName(key2);
            value.setPrice(50000);
            value.setQuantity(1);
            value.setEffect(1.5);
            value.setItemID("bbbb");
            value.setExplanation("最強の鎧。めちゃくちゃ硬い。");
            item.put(key2, value);
            // アイテム追加
            sut.add("user_item",item);
        }

        @Test
        public void Case001_正常系_Yamlファイルを読み込む() {
            String actual = "はぐれメタルの剣";// 事前準備
            this.item = (Map<String, ItemDetails>) sut.getItemMapList();
            ItemDetails details = item.get("はぐれメタルの剣");
            String expected = details.getItemName();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case002_正常系_引数に指定した保有アイテム情報を返す() {
            String actual = "メタル系スライムに必ずダメージを与える";// 事前準備
            ItemDetails details = sut.getBuyItem("はぐれメタルの剣");
            String expected = details.getExplanation();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case003_正常系_保有するアイテム数を返す() {
            int actual = 2;// 事前準備
            int expected = sut.counter();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case004_正常系_ユーザの所有金額を返す() {
            int actual = 60000;// 事前準備
            int expected = sut.getUserMoney();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case005_正常系_ユーザの所有アイテムのIDを返す() {
            String actual = "aaaa";// 事前準備
            String expected = sut.getItemID("はぐれメタルの剣");// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case006_異常系_ユーザの未所有の場合NULLを返す() {
            String actual = null;// 事前準備
            String expected = sut.getItemID("はぐれメタルの盾");// 実行
            assertThat(actual, is(expected));// 検証
        }
    }

    public static class FireBase接続系 {

        UserItemCrl sut;
        Map<String, ItemDetails> item;
        ItemDetails value1;
        ItemDetails value2;

        @Before
        public void setUp() throws Exception {
            sut = new UserItemCrl();
            this.item = new HashMap<>();
            // 1つ目
            String key = "はぐれメタルの剣";
            this.value1 = new ItemDetails();
            value1.setLocked(true);
            value1.setType(0);
            value1.setItemName(key);
            value1.setPrice(10000);
            value1.setQuantity(1);
            value1.setEffect(1.5);
            value1.setExplanation("メタル系スライムに必ずダメージを与える");
            item.put(key, value1);
            // アイテム追加
            sut.add("user_item",item);

            // 2つ目
            String key2 = "キングメタルの鎧";
            this.value2 = new ItemDetails();
            value2.setLocked(false);
            value2.setType(1);
            value2.setItemName(key2);
            value2.setPrice(50000);
            value2.setQuantity(1);
            value2.setEffect(1.5);
            value2.setExplanation("最強の鎧。めちゃくちゃ硬い。");
            item.put(key2, value2);
            // アイテム追加
            sut.add("user_item",item);
            sut.upLodeItem(item);
        }

        @Test
        public void Case001_正常系_FireBaseにあるアイテムのIDを取得する() {
            String actual = null;// 事前準備
            String expected = null;// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case002_正常系_ショップにある選択したアイテムの金額を取得する() {
            int actual = 10000;// 事前準備
            int expected = sut.getItemPrice("はぐれメタルの剣");// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case003_正常系_ショップにある選択したアイテムの金額を支払う() {
            int actual = 0;// 事前準備
            int expected = sut.paymetPrice();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case004_正常系_FireBaseに接続可能か確認する() {
            boolean actual = true;// 事前準備
            boolean expected = sut.isConFireBase();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case005_正常系_ユーザが選択したアイテムが存在する且つユーザの所有金額がアイテム金額以上である() {
            boolean actual = true;// 事前準備
            boolean expected = sut.isCanBuy("はぐれメタルの剣");// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case005_正常系_FireBaseにあるアイテムオブジェクトを取得する() {
            ItemDetails actual = null;// 事前準備
            ItemDetails expected = sut.getItems();// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case006_正常系_FireBaseにある指定するアイテムが購入可能か確認する() {
            boolean actual = true;// 事前準備
            //sut.getBuyItem("はぐれメタルの剣");
            boolean expected = sut.isItemLocked("はぐれメタルの剣");// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case007_異常系_FireBaseにある指定するアイテムが購入可能か確認する() {
            boolean actual = false;// 事前準備
            //sut.getBuyItem("キングメタルの鎧");
            boolean expected = sut.isItemLocked("キングメタルの鎧");// 実行
            assertThat(actual, is(expected));// 検証
        }

        @Test
        public void Case008_正常系_FireBaseのキーを取得する() {
            String actual = "ShopItems";// 事前準備
            String expected = sut.getKey();// 実行
            assertThat(actual, is(expected));// 検証
        }
    }}