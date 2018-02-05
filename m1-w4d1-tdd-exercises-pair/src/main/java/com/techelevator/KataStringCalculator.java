package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KataStringCalculator {

	
	public int add(String numbers) {
		
		int result = 0;
		
		if (numbers == "") {
			result = 0;
		}
		
		else {
			
			String text = numbers.replaceAll("[^a-zA-Z0-9-]", ",");
			System.out.println(text);
			String help = "";
			String done = "";
			for(int i = 0; i < text.length() - 1; i++) {
				if (text.charAt(i) != ',' || (text.charAt(i) == ',' && text.charAt(i + 1) != ',' )) {
					help+=text.charAt(i);

					
				}

			}
			if (text.charAt(text.length() -1) != ',') {
				help+= text.charAt(text.length() -1);
			}
			if (text.charAt(0) == ',') {
				done = help.substring(1);
			}
			System.out.println(help);
			System.out.println(done);;
			
			List<String> list = new ArrayList<String>();
			
			list = Arrays.asList(done.split(","));
			Stack<String> theStack = new Stack<String>();
			for(String s : list) {
				System.out.println(s);
			}
			
			int[] nums = new int[list.size()];
			
			for (String s : list) {
				theStack.push(s);
			}
			
			for (int i = 0; i < list.size(); i++) {
				nums[i]= Integer.parseInt(theStack.pop());
				result += nums[i];
//				System.out.println(nums[i]);
			}

		}
		return result;
	}
}
		
	

//nums = list.toArray();
//for(int i = 0; i < list.size(); i++) {
//
//}


//String[] splitNums = new String[10];
//int[] nums = new int[10];
//splitNums = numbers.split(",");

//int add = 0;
//for (String i: list) {
//
//nums[i] = Integer.parseInt(list[i]);
//add += nums[i];
//result =  nums[0] + nums[1];
//
//}
		
	
	

