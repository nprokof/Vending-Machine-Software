package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSVLogic {
	
	public String vendList = "";
	public String displayProd() {
		try {
			
<<<<<<< HEAD
			File inputFile = new File("/Users/bhelton/Development/PairExercises/java-week4-pair-exercise/team7-java-week4-pair-exercise/m1-capstone/vendingmachine.csv");
=======
			File inputFile = new File("vendingmachine.csv");
>>>>>>> a5ad44f04f65cfae2123fc6648ae6054237225f1
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line = "";

			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
				
				vendList = stringBuffer.toString();
				
			}fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			}
		
		
		return vendList;
		
	}

	
	public ArrayList<String[]> createProdList() {
		ArrayList<String[]> prodList = new ArrayList<String[]>();
		try {
	
			File inputFile = new File("/Users/bhelton/Development/PairExercises/java-week4-pair-exercise/team7-java-week4-pair-exercise/m1-capstone/vendingmachine.csv");
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";
			String[] prodInfo;

			while ((line = bufferedReader.readLine()) != null) {
				prodInfo = line.split("\\|");
				prodList.add(prodInfo);
//				fileReader.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			}
		return prodList;
	}
}

