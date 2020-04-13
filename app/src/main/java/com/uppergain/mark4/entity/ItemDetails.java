package com.uppergain.mark4.entity;

public class ItemDetails {

	//購入可否フラグ
	private boolean locked = false;
	//ID
	private String itemID;
	//アイテムレベル
	private String itemLevel;
	//アイテム種別-0:武器-1:防具-2:道具-3:その他
	private int type;
	//アイテム名
	private String itemName;
	//価格
	private int price;
	//個数
	private int quantity;
	//効果
	private double effect;
	//説明
	private String explanation;
	
	public ItemDetails() {
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(String itemLevel) {
		this.itemLevel = itemLevel;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getEffect() {
		return effect;
	}

	public void setEffect(double effect) {
		this.effect = effect;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
}
