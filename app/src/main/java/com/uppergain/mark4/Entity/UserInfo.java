package com.uppergain.mark4.Entity;

/**
 * ユーザ情報クラス<br>
 * 基底GoF:-
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-04
 */
public class UserInfo {

	// UUID
	private String uuid;
	// 買い手ID
	private String buyerID;
	// 売り手ID
	private String sellerID;
	// ニックネーム
	private String userName;
	// 会員状態
	private String userState;
	// メールアドレス
	private String mail;
	// UGCoin［ブロックチェーン対応］
	private String coin;
	// 初期HP
	private int initHP;
	// 現在HP
	private int currentHP;
	// 最大HP
	private int maxHP;
	// 詳細ユーザ設定
	private AdvancedSetting setting;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(String buyerID) {
		this.buyerID = buyerID;
	}

	public String getSellerID() {
		return sellerID;
	}

	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCoin() {
		return coin;
	}

	public void setCoin(String coin) {
		this.coin = coin;
	}

	public int getInitHP() {
		return initHP;
	}

	public void setInitHP(int initHP) {
		this.initHP = initHP;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public AdvancedSetting getSetting() {
		return setting;
	}

	public void setSetting(AdvancedSetting setting) {
		this.setting = setting;
	}

}
