package com.techelevator.Inventory;

public abstract class Candy extends Inventory {
	
	public abstract void readCSV();
	
	private String itemName = "";
	private String price = "";
		
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}


	public void bOne() {
		String itemName = "";
		String price = "";
		
		String[] candyBOne = new String[3];
		
	}
	
	public void bTwo() {
		String itemName = "";
		String price = "";
		
		String[] candyBTwo = new String[3];
	}
	
	public void bThree() {
		String itemName = "";
		String price = "";
		
		String[] candyBthree = new String[3];

	}
	
	public void bFour() {
		String itemName = "";
		String price = "";
		
		String[] candyBFour = new String[3];

	}


	
	
	

}

