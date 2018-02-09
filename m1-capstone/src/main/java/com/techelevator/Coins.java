package com.techelevator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coins {

	private static final Coin[] coins = new Coin[] { 
			new Quarter(), new Dime(), new Nickel() };
	
	public Map<Coin, Integer> calculateChg(double breakBills) {
//	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Amount to make change for (no pennies returned)?");
		int amount = (int)(breakBills * 100);
		
		Map<Coin, Integer> change = new HashMap<Coin, Integer>();
		
		for (Coin coin : coins) {
			if (amount <= 0) { break; }
			int cnt = amount / coin.getValue();
			if (cnt > 0) {
				amount = amount % (coin.getValue() * cnt);
				change.put(coin, cnt);
			}
		}
		return change;
		
//		for (Coin coin : change.keySet()) {
//			System.out.println(change.get(coin) + " " + coin.getName() + "(s)");
	}
		
}

