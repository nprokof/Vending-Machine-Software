package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class CThree extends Beverage implements Popper {
	
	Stack<String> mtnMelter = new Stack<String>();
	
	ReadCSVLogic prodInfo = new ReadCSVLogic();

	private String itemName = null;
	private Double price = 0.0;

	public String getItemName() {
		itemName = prodInfo.createProdList().get(10)[1];
		return itemName;
	}
	
	public CThree() {
		mtnMelter.add(itemName);
		mtnMelter.add(itemName);
		mtnMelter.add(itemName);
		mtnMelter.add(itemName);
		mtnMelter.add(itemName);
	}
	@Override
	public void popIt() {
		if(mtnMelter.size()>0) {
			mtnMelter.pop();
		} else {
			System.out.println("There are no more, dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = mtnMelter.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(10)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(10)[1];
		return itemName;
	}
}
