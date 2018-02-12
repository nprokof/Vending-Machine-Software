package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class CFour extends Beverage implements Popper {
	
Stack<String> heavy = new Stack<String>();

ReadCSVLogic prodInfo = new ReadCSVLogic();

private String itemName = null;
private Double price = 0.0;

public String getItemName() {
	itemName = prodInfo.createProdList().get(11)[1];
	return itemName;
}
	
	public void heavy() {
		heavy.add(itemName);
		heavy.add(itemName);
		heavy.add(itemName);
		heavy.add(itemName);
		heavy.add(itemName);
	}
	@Override
	public void popIt() {
		if(heavy.size()>0) {
			heavy.pop();
		} else {
			System.out.println("There are no more, dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = heavy.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(11)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(11)[1];
		return itemName;
	}
}
