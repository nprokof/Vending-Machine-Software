package com.techelevator.Inventory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Inventory {
	
public void readCSV() {
		
		String path = "/Users/bhelton/Development/PairExercises/java-week4-pair-exercise/team7-java-week4-pair-exercise/m1-capstone/vendingmachine.csv";
		
		//Declares input file
				File inventory = new File(path);
		//Checks if file exists and is a file
				if(inventory.exists() == false) {
					System.out.println(path + " path does not exist dummy");
					System.exit(1);
				} else if (inventory.isFile() == false) {
					System.out.println(path + " this is not the file you are looking for nerd");
					System.exit(1);
				}
				
				
				
		}
		public void pasreCSV() throws FileNotFoundException, IOException {
			//PATH WILL NEED TO BE UPDATED WHEN PROGRAM IS RUN
			
			String path = "/Users/bhelton/Development/PairExercises/java-week4-pair-exercise/team7-java-week4-pair-exercise/m1-capstone/vendingmachine.csv";
			
		//Declares input file
			File inventory = new File(path);
		//Checks if file exists and is a file
			if(inventory.exists() == false) {
				System.out.println(path + " path does not exist dummy");
				System.exit(1);
			} else if (inventory.isFile() == false) {
				System.out.println(path + " this is not the file you are looking for nerd");
				System.exit(1);
			}
			
			try (BufferedReader reader = new BufferedReader(new FileReader(inventory))){
				String line;
				String delimiter = "|";
				String[] lineItem = new String[3];
				while ((line = reader.readLine()) != null) {
					for (int i = 0; i < line.length(); i++) {
						if (delimiter.indexOf(line.charAt(i)) != -1){
							lineItem = line.split("|");
							System.out.println(i);
						}
					}
				}
			}
			
		}

}
