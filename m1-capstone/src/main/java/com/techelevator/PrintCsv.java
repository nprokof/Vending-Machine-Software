package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintCsv {
	
	public void printFile() throws FileNotFoundException, IOException {
		
		String path = "";
		
		File inventory = new File(path);
	
		String printOut = null;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(inventory))){
			String line = reader.readLine();
			
			//String delimiter = "|";
			while(line != null) {
				//for (int i = 0; i < line.length(); i++) {
					printOut += (line + "\n");
			}
		}
		
		System.out.println(printOut);
		
	}
	
	public void makeEatingSound() {
		
	}
}
 

