package com.techelevator;

public class VendBank {
	
	private double currentBal = 0.00;
	
	public double getBal() {
		return currentBal;
	}
	public void add(int dollar) {
		currentBal+= (double) dollar;
		
	}
	public void subtract(double cost) {
		currentBal -= cost;
	}
	public String change() {
		String message = "";
	
		Coins change = new Coins();

		message = "\nYour change is: \n";
		for (Coin coin : change.calculateChg(currentBal).keySet()) {
			message += String.valueOf(change.calculateChg(currentBal).get(coin)) + 
					" " + coin.getName() + "(s) \n";
		}
		currentBal = 0.00;
		return message;
							
	}
			
}


