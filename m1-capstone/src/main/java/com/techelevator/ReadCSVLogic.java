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
			
			File inputFile = new File("vendingmachine.csv");
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
	
			File inputFile = new File("vendingmachine.csv");
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";
			String[] prodInfo;

			while ((line = bufferedReader.readLine()) != null) {
				prodInfo = line.split("\\|");
				prodList.add(prodInfo);

			}
			
		} catch (IOException e) {
			e.printStackTrace();
			}
		return prodList;
	}
}

