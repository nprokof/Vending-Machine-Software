package com.techelevator.Inventory;

import java.util.HashMap;
import java.util.Map;

import com.techelevator.readCSVLogic;

public abstract class Candy extends Inventory {
	
//	public static void main(String[] args) {
//		Object stuff = makePurchase();
//	}

	readCSVLogic prodInfo = new readCSVLogic();	
	BOne one = new BOne();
	String purchased = "";
	
	static Map<String, Object> prodMap = new HashMap<String, Object>();
	
	public Candy() {
		prodMap.put("B1", one);	
	}
	
//	public static Object makePurchase() {
//		return prodMap.get("B1");
//	}
	
	//public static Object makePurchase() {
	//return prodMap.get("B1").method;
	
	
	
	//	public abstract void readCSV();
	
//	private String itemName = "";
//	private String price = "";
	

		
//	public String getItemName() {
//		return itemName;
//	}
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
//	public String getPrice() {
//		return price;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}


	public abstract void bOne();



	
	
	

}

