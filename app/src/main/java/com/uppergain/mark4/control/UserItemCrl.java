package com.uppergain.mark4.control;

import com.uppergain.mark4.Entity.ItemDetails;
import com.uppergain.mark4.framework.io.DataFileIO;
import com.uppergain.mark4.framework.io.YamlFileData;

import java.util.Map;

/**
 * ユーザが保有するアイテム操作関連クラス<br>
 * 基底GoF:-
 *
 * @author ntakimoto
 * @version 0.0.2
 * @since 2020-04-03
 */
public class UserItemCrl {

    private DataFileIO yData;
    private DataFileIO fData;

    public UserItemCrl() {
        yData = new YamlFileData();
    }

    /**
     * 保有するアイテム情報を返す
     *
     * @param itemName
     * @return 指定したアイテム情報
     */
    public ItemDetails getBuyItem(String itemName) {
        Map<String, ItemDetails> yamlList = (Map<String, ItemDetails>) getItemMapList();
        if (yamlList.containsKey(itemName)) {
            // 取得した詳細を返す
            return yamlList.get(itemName);
        }
        return null;
    }

    /**
     * Yamlファイルを読み込む
     *
     * @return
     */
    public Object getItemMapList() {
        return yData.reder("user_item");
    }

    /**
     * 選択したアイテムをショップに出品する
     */
    public void askItem(String itemName) {
        ItemDetails askItem = null;
        Map<String, ItemDetails> yamlList = (Map<String, ItemDetails>) getItemMapList();
        if (yamlList.containsKey(itemName)) {
            askItem = yamlList.get(itemName);
            upLodeItem(askItem);
        }
    }

    /**
     * FireBaseにアイテム情報をアップロードする
     *
     * @param askItem
     */
    public void upLodeItem(ItemDetails askItem) {
    }

    /**
     * 保有するアイテム数を返す
     *
     * @return アイテム数
     */
    public int counter() {
        Map<String, ItemDetails> yamlList = (Map<String, ItemDetails>) getItemMapList();
        return yamlList.size();
    }

    /**
     * 購入したアイテムを永続データに追加する
     *
     * @param fileName
     * @param item     アイテムリスト
     */
    public void add(String fileName, Map<String, ItemDetails> item) {
        yData.writer(fileName, item);
    }

    /**
     * ショップにある選択したアイテムの金額を取得する
     *
     * @param itemName アイテム名
     * @return アイテム金額
     */
    public int getItemPrice(String itemName) {
        Map<String, ItemDetails> yamlList = (Map<String, ItemDetails>) getItemMapList();
        if (yamlList.containsKey(itemName)) {
            // 取得したアイテムの金額を返す
            int price = yamlList.get(itemName).getPrice();
            return price;
        }
        return 0;
    }

    /**
     * ショップにある選択したアイテムの金額を支払う
     *
     * @return
     */
    public int paymetPrice() {
        return 0;
    }

    /**
     * ユーザが選択したアイテムが存在する且つユーザアイテムの所有金額がアイテム金額以上である
     *
     * @return 購入可能確認結果
     */
    public boolean isCanBuy(String itemName) {
        int itemCount = this.counter();
        int money = this.getUserMoney();
        int itemPrice = this.getItemPrice(itemName);
        if (itemCount > 1 && money >= itemPrice) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * ユーザの所有金額を返す
     *
     * @return
     */
    public int getUserMoney() {
        UserInfoCrl crl = new UserInfoCrl();
        int coin = Integer.parseInt(crl.getCoin());
        return coin;
    }

    /**
     * FireBaseに接続可能か確認する
     *
     * @return
     */
    public boolean isConFireBase() {
        return false;
    }

    /**
     * FireBaseにあるアイテムを購入申請する
     */
    public void buyItemRequest(int ItemID) {
        if (!isConFireBase()) {
            // メッセージ出力
        } else {
            // FireBaseにあるアイテムを購入申請する処理
        }
    }

    /**
     * FireBaseにあるアイテムのIDを取得する
     *
     * @return
     */
    public String getItemID() {
        return null;
    }
}
