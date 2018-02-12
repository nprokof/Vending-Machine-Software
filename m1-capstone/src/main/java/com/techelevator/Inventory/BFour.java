package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class BFour extends Candy implements Popper {
	
	Stack<String> crunchie = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(7)[1];
		return itemName;
	}

	public BFour() {
		
		crunchie.push(itemName);
		crunchie.push(itemName);
		crunchie.push(itemName);
		crunchie.push(itemName);
		crunchie.push(itemName);
	}

	@Override
	public void popIt() {
		if (crunchie.size() >0) {
			crunchie.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = crunchie.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(7)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(7)[1];
		return itemName;
	}

}

