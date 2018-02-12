package com.techelevator;

import com.techelevator.Inventory.Candy;
import com.techelevator.Inventory.*;
public class ChangeTester {

	



	public static void main(String[] args) {

//		VendBank bank = new VendBank();
//		
//		bank.add(5);
//		bank.subtract(1.60);
//		System.out.println(bank.change());
		

//		Candy candyTest = new Candy();
		
		Inventory helper = new Inventory();
		

		
		readCSVLogic stuff = new readCSVLogic();
		
		double firstDouble = Double.parseDouble(stuff.createProdList().get(0)[2]);
		
		String firstName = stuff.createProdList().get(0)[1];
		
		System.out.println(firstDouble);
		System.out.println(firstName);
		

	

	}

}
