package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class BTwo extends Candy implements Popper {
	
	Stack<String> cowTails = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(5)[1];
		return itemName;
	}

	public BTwo() {
		
		cowTails.push(itemName);
		cowTails.push(itemName);
		cowTails.push(itemName);
		cowTails.push(itemName);
		cowTails.push(itemName);
	}

	@Override
	public void popIt() {
		if (cowTails.size() >0) {
			cowTails.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = cowTails.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(5)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(5)[1];
		return itemName;
	}

}
