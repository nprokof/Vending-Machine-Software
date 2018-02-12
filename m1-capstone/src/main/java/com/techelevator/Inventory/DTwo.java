package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class DTwo extends Gum implements Popper {
	
	Stack<String> littleLeague = new Stack<String>();
	
	ReadCSVLogic prodInfo = new ReadCSVLogic();

	private String itemName = null;
	private Double price = 0.0;

	public String getItemName() {
		itemName = prodInfo.createProdList().get(13)[1];
		return itemName;
	}
	public void littleLeague() {
		littleLeague.add(itemName);
		littleLeague.add(itemName);
		littleLeague.add(itemName);
		littleLeague.add(itemName);
		littleLeague.add(itemName);
	}
	@Override
	public void popIt() {
		if(littleLeague.size()>0) {
			littleLeague.pop();
		} else {
			System.out.println("There are no more, dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = littleLeague.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(13)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(13)[1];
		return itemName;
	}

}
