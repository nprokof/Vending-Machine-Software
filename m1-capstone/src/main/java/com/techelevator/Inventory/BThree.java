package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class BThree extends Candy implements Popper {
	
	Stack<String> wonkaBar = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(6)[1];
		return itemName;
	}

	public BThree() {
		
		wonkaBar.push(itemName);
		wonkaBar.push(itemName);
		wonkaBar.push(itemName);
		wonkaBar.push(itemName);
		wonkaBar.push(itemName);
	}

	@Override
	public void popIt() {
		if (wonkaBar.size() >0) {
			wonkaBar.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = wonkaBar.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(6)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(6)[1];
		return itemName;
	}

}
