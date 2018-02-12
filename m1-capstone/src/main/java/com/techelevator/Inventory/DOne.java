package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class DOne extends Gum implements Popper {
	
	Stack<String> uChew = new Stack<String>();
	
	ReadCSVLogic prodInfo = new ReadCSVLogic();

	private String itemName = null;
	private Double price = 0.0;

	public String getItemName() {
		itemName = prodInfo.createProdList().get(12)[1];
		return itemName;
	}
	
	public DOne() {
		
		uChew.add(itemName);
		uChew.add(itemName);
		uChew.add(itemName);
		uChew.add(itemName);
		uChew.add(itemName);
	}

	@Override
	public void popIt() {
		if(uChew.size()>0) {
			uChew.pop();
		} else {
			System.out.println("There are no more, dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = uChew.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(12)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(12)[1];
		return itemName;
	}
}
