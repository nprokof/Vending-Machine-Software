package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KataStringCalculator {

	
	public int add(String numbers) {
		
		int result = 0;
		String help = "";
		Stack<String> theStack = new Stack<String>();
		List<String> list = new ArrayList<String>();
	
		if (numbers != "") {
			
			String text = numbers.replaceAll("[^a-zA-Z0-9-]", ",");
			
			//remove extra commas, put remainder in new string
			for(int i = 0; i < text.length() - 1; i++) {
				if (text.charAt(i) != ',' || ((text.charAt(i) == ',') && (text.charAt(i + 1) != ','))) {
					help+=text.charAt(i);
				}
			}
			//add back lost character
			if (text.charAt(text.length() -1) != ',') {
				help+= text.charAt(text.length() -1);
			}
			//remove leading comma
			if (text.charAt(0) == ',') {
				help = help.substring(1);
			}
			//remove trailing comma
			if (help.charAt((help.length() -1 )) == ',') {
				help = help.substring(0, help.length() - 1);
			}
			
			//split the string
			list = Arrays.asList(help.split(","));

			//push from listArray to Stack
			for (String s : list) {
				theStack.push(s);
			}
			//pop, parse, add

			while (!theStack.empty()) {
				result+= Integer.parseInt(theStack.pop());

			}

		
	
		
	}
		return result;
}
}
		
	


		
	
	

