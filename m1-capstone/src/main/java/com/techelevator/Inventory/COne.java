package com.techelevator.Inventory;

import java.util.Stack;

import com.techelevator.ReadCSVLogic;

public class COne extends Candy implements Popper{
	
Stack<String> cola = new Stack<String>();

ReadCSVLogic prodInfo = new ReadCSVLogic();

private String itemName = null;
private Double price = 0.0;

public String getItemName() {
	itemName = prodInfo.createProdList().get(8)[1];
	return itemName;
}
	
	public COne() {
		
		cola.add(itemName);
		cola.add(itemName);
		cola.add(itemName);
		cola.add(itemName);
		cola.add(itemName);
	}

	@Override
	public void popIt() {
		if(cola.size()>0) {
			cola.pop();
		} else {
			System.out.println("There are no more dummy!");
		}
	}

	@Override
	public int sizeIt() {
		int size = cola.size();
		return size;
	}

	@Override
	public double priceIt() {
		price = Double.parseDouble(prodInfo.createProdList().get(8)[2]);
		return price;
	}

	@Override
	public String nameIt() {
		itemName = prodInfo.createProdList().get(8)[1];
		return itemName;
	}

}
