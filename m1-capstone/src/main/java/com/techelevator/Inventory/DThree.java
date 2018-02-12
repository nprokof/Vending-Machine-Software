package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class DThree extends Gum implements Popper {
	
	Stack<String> chicklets = new Stack<String>();
	
	ReadCSVLogic prodInfo = new ReadCSVLogic();

	private String itemName = null;
	private Double price = 0.0;

	public String getItemName() {
		itemName = prodInfo.createProdList().get(14)[1];
		return itemName;
	}
	public DThree() {
		chicklets.add(itemName);
		chicklets.add(itemName);
		chicklets.add(itemName);
		chicklets.add(itemName);
		chicklets.add(itemName);
	}
	@Override
	public void popIt() {
		if(chicklets.size()>0) {
			chicklets.pop();
		} else {
			System.out.println("There are no more, dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = chicklets.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(14)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(14)[1];
		return itemName;
	}

}
