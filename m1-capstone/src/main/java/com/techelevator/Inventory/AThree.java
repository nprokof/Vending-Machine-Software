package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class AThree extends Chips implements Popper{
	
	Stack<String> grainWaves = new Stack<String>();

	ReadCSVLogic prodInfo = new ReadCSVLogic();
	
	private String itemName = null;
	private Double price = 0.0;
	
	public String getItemName() {
		itemName = prodInfo.createProdList().get(2)[1];
		return itemName;
	}

	public AThree() {
		
		grainWaves.push(itemName);
		grainWaves.push(itemName);
		grainWaves.push(itemName);
		grainWaves.push(itemName);
		grainWaves.push(itemName);
	}

	@Override
	public void popIt() {
		if (grainWaves.size() >0) {
			grainWaves.pop();
		} else {
			System.out.println("There are no more dummy!");
		}	
	}

	@Override
	public int sizeIt() {
		int size = grainWaves.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(2)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(2)[1];
		return itemName;
	}
	

}
