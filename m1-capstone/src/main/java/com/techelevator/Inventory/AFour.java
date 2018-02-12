package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class AFour extends Chips implements Popper {
	
	Stack<String> cloudPopcorn = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(3)[1];
		return itemName;
	}

	public AFour() {
		
		cloudPopcorn.push(itemName);
		cloudPopcorn.push(itemName);
		cloudPopcorn.push(itemName);
		cloudPopcorn.push(itemName);
		cloudPopcorn.push(itemName);
	}

	@Override
	public void popIt() {
		if (cloudPopcorn.size() >0) {
			cloudPopcorn.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = cloudPopcorn.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(3)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(3)[1];
		return itemName;
	}

}
