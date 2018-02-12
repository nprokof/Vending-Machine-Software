package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class BOne extends Candy implements Popper {
	
	Stack<String> moonPie = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(4)[1];
		return itemName;
	}

	public BOne() {
		
		moonPie.push(itemName);
		moonPie.push(itemName);
		moonPie.push(itemName);
		moonPie.push(itemName);
		moonPie.push(itemName);
	}

	@Override
	public void popIt() {
		if (moonPie.size() >0) {
			moonPie.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = moonPie.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(4)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(4)[1];
		return itemName;
	}
}
