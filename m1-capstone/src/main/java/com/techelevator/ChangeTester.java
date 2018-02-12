package com.techelevator;

public class ChangeTester {

	



	public static void main(String[] args) {

//		VendBank bank = new VendBank();
//		
//		bank.add(5);
//		bank.subtract(1.60);
//		System.out.println(bank.change());
		

				
		
		
		readCSVLogic stuff = new readCSVLogic();
		
		double firstDouble = Double.parseDouble(stuff.createProdList().get(0)[2]);
		
		System.out.println(firstDouble);
		
		System.out.println(stuff.displayProd());
	

	}

}
