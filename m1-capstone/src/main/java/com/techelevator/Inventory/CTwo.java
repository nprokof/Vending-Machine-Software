package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class CTwo extends Beverage implements Popper {
	Stack<String> drSalt = new Stack<String>();
	
	ReadCSVLogic prodInfo = new ReadCSVLogic();

	private String itemName = null;
	private Double price = 0.0;

	public String getItemName() {
		itemName = prodInfo.createProdList().get(9)[1];
		return itemName;
	}
	

	
	public CTwo() {
		drSalt.add(itemName);
		drSalt.add(itemName);
		drSalt.add(itemName);
		drSalt.add(itemName);
		drSalt.add(itemName);
	}
	@Override
	public void popIt() {
		if(drSalt.size()>0) {
			drSalt.pop();
		} else {
			System.out.println("There are no more dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = drSalt.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(9)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(9)[1];
		return itemName;
	}
}
