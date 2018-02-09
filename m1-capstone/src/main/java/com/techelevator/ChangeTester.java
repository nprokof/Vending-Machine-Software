package com.techelevator;

public class ChangeTester {

	public static void main(String[] args) {

		VendBank bank = new VendBank();
		
		bank.add(5);
		bank.subtract(1.60);
		System.out.println(bank.change());
		

	}

}
