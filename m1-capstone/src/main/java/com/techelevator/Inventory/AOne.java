package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class AOne extends Candy implements Popper{

	Stack<String> potatoCrisps = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(0)[1];
		return itemName;
	}

	public AOne() {
		
		potatoCrisps.push(itemName);
		potatoCrisps.push(itemName);
		potatoCrisps.push(itemName);
		potatoCrisps.push(itemName);
		potatoCrisps.push(itemName);
	}

	@Override
	public void popIt() {
		if (potatoCrisps.size() >0) {
			potatoCrisps.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = potatoCrisps.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(0)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(0)[1];
		return itemName;
	}
	
}
