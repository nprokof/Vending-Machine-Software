package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class DFour extends Gum implements Popper {
	
	Stack<String> tripleMint = new Stack<String>();
	
	ReadCSVLogic prodInfo = new ReadCSVLogic();

	private String itemName = null;
	private Double price = 0.0;

	public String getItemName() {
		itemName = prodInfo.createProdList().get(15)[1];
		return itemName;
	}
	public void tripleMint() {
		tripleMint.add(itemName);
		tripleMint.add(itemName);
		tripleMint.add(itemName);
		tripleMint.add(itemName);
		tripleMint.add(itemName);
	}
	@Override
	public void popIt() {
		if(tripleMint.size()>0) {
			tripleMint.pop();
		} else {
			System.out.println("There are no more, dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = tripleMint.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(15)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(15)[1];
		return itemName;
	}

}
