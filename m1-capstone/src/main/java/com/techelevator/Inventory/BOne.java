package com.techelevator.Inventory;

import java.util.Stack;

public class BOne extends Candy implements Popper {
	
Stack<String> moonPie = new Stack<String>();
	
	String itemName = "";
	Double price = 0.0;

	@Override
	public void bOne() {

		price = Double.parseDouble(prodInfo.createProdList().get(4)[2]);
	
	}	

	public BOne() {
		itemName = prodInfo.createProdList().get(4)[1];
		moonPie.add(itemName);
		moonPie.add(itemName);
		moonPie.add(itemName);
		moonPie.add(itemName);
		moonPie.add(itemName);
	}
//public void moonPie() {
//		
//	}
	


	@Override
	public void readCSV() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void popIt() {
		moonPie.pop();
		
	}



}
