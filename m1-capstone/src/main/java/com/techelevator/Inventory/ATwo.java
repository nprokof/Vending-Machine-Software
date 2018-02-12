package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class ATwo extends Chips implements Popper {
	
	Stack<String> stackers = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(1)[1];
		return itemName;
	}

	public ATwo() {
		
		stackers.push(itemName);
		stackers.push(itemName);
		stackers.push(itemName);
		stackers.push(itemName);
		stackers.push(itemName);
	}

	@Override
	public void popIt() {
		if (stackers.size() >0) {
			stackers.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = stackers.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(1)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(1)[1];
		return itemName;
	}

}
