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
			
			List<String> list = new ArrayList<String>();
			
			list = Arrays.asList(numbers.split(","));
			Stack<String> theStack = new Stack<String>();
			int[] nums = new int[list.size()];
			
			for (String s : list) {
				theStack.push(s);
			}
			
			for (int i = 0; i < list.size(); i++) {
				nums[i]= Integer.parseInt(theStack.pop());
				result += nums[i];
				System.out.println(nums[i]);
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
		
	
	

