package com.techelevator.Inventory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.techelevator.VendBank;

public class Inventory {

	Map<String, Popper> prodMap = new HashMap<String, Popper>();
//	VendBank currentBank = new VendBank();

	BOne one = new BOne();
	
	public Inventory() {
		prodMap.put("B1", one);	
	}
	
	public void makePurchase(String input) {
		prodMap.get(input).popIt();
	}
	
	public double debitBal(String input) {
		return (prodMap.get(input).priceIt());
	}
	
	public String piggyPal(String input) {
		
		if (prodMap.get(input) instanceof BOne) {
			BOne one = (BOne)prodMap.get(input);
			return one.makeNoise();
		}
		
		return null;
		//return null;
	}
	
	public String snackName(String input) {
		return (prodMap.get(input).nameIt());
	}
	
	
	
	
	
	
	
public void readCSV() {
		
//		String path = "/Users/bhelton/Development/PairExercises/java-week4-pair-exercise/team7-java-week4-pair-exercise/m1-capstone/vendingmachine.csv";
//		
//		//Declares input file
//				File inventory = new File(path);
//		//Checks if file exists and is a file
//				if(inventory.exists() == false) {
//					System.out.println(path + " path does not exist dummy");
//					System.exit(1);
//				} else if (inventory.isFile() == false) {
//					System.out.println(path + " this is not the file you are looking for nerd");
//					System.exit(1);
//				}
//				
//				
//				
//		}
//		public void pasreCSV() throws FileNotFoundException, IOException {
//			//PATH WILL NEED TO BE UPDATED WHEN PROGRAM IS RUN
//			
//			String path = "/Users/bhelton/Development/PairExercises/java-week4-pair-exercise/team7-java-week4-pair-exercise/m1-capstone/vendingmachine.csv";
//			
//		//Declares input file
//			File inventory = new File(path);
//		//Checks if file exists and is a file
//			if(inventory.exists() == false) {
//				System.out.println(path + " path does not exist dummy");
//				System.exit(1);
//			} else if (inventory.isFile() == false) {
//				System.out.println(path + " this is not the file you are looking for nerd");
//				System.exit(1);
//			}
//			
//			try (BufferedReader reader = new BufferedReader(new FileReader(inventory))){
//				String line;
//				String delimiter = "|";
//				String[] lineItem = new String[3];
//				while ((line = reader.readLine()) != null) {
//					for (int i = 0; i < line.length(); i++) {
//						if (delimiter.indexOf(line.charAt(i)) != -1){
//							lineItem = line.split("|");
//							System.out.println(i);
//						}
//					}
//				}
//			}
			
		}

}
