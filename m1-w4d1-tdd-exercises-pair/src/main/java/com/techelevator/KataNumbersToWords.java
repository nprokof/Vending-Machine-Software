package com.techelevator;

import java.util.HashMap;
import java.util.Map;

/*
 *     ***********Still working on final solution for conversion to numbers*************
 * 
 */




public class KataNumbersToWords {
	
	Map<Integer, String> oneDigit = new HashMap<Integer, String>();
	Map<Integer, String> twoDigit = new HashMap<Integer, String>();
	
	public String converterToWords(int number) {
		
		String tempNum = Integer.toString(number);
		String result = "";
		
		
		
		
		if (number >= 20) {
						
			String reverse = "";
			for(int i = tempNum.length()-1; i > - 1; i--) {
				reverse += Character.toString(tempNum.charAt(i));
			}
			//ten-thousands
			if(reverse.length() == 5) {
				if(number % 10000 == 0) {
					if (number == 10000) {
						return "ten thousand";
					}
					return (twoDigit.get(number/10000) + " thousand");
				}
				if((reverse.charAt(4) == '1') && (reverse.charAt(5) !=0)) {
					reverse = reverse.substring(4);
					int teens = Integer.parseInt(reverse);
					result += oneDigit.get(teens);
					return result;
				}
				int thouDigit = Character.getNumericValue(reverse.charAt(3));
				result += (oneDigit.get(thouDigit) + " thousand and ");
				reverse = reverse.substring(0, reverse.length() -1);
			}
			//thousands
			if(reverse.length() == 4) {
				if(number % 1000 == 0) {
					return (oneDigit.get(number/1000) + " thousand");
				}
				int thouDigit = Character.getNumericValue(reverse.charAt(3));
				result += (oneDigit.get(thouDigit) + " thousand and ");
				reverse = reverse.substring(0, reverse.length() -1);
			}
			
			//hundreds
			if(reverse.length() == 3) {
				if(number % 100 == 0) {
					return (oneDigit.get(number/100) + " hundred");
				}

				int hundDigit = Character.getNumericValue(reverse.charAt(2));
				if (hundDigit == 0) {
					result += "";
				}
				else {
					result += (oneDigit.get(hundDigit) + " hundred and ");
				}
			}
	
			
			//tens under 100
			
			if(number % 10 == 0 && number < 100) {
				return twoDigit.get(number/10);
			}
			
			
			if((reverse.charAt(0) == '1') && (reverse.charAt(1) !=0)) {
				reverse = reverse.substring(0, reverse.length() - 1);
				String reverseBack = "";
				for(int i = reverse.length()-1; i > - 1; i--) {
					reverseBack += Character.toString(reverse.charAt(i));
				}
				
				
				int teens = Integer.parseInt(reverseBack);
				result += oneDigit.get(teens);
				return result;
			}
			//two-digit non-10s
			int tensDigit = Character.getNumericValue(reverse.charAt(1));
			
			if (tensDigit == 0) {
				result += "";
			}
			else {
				result += twoDigit.get(tensDigit);
				result += "-";
			}
			

			//last digit
			int lastDigit = Character.getNumericValue(reverse.charAt(0));
			result += oneDigit.get(lastDigit);
			return result;
			
		} 
		

			
		else {
		
		return oneDigit.get(number);
		}
	}
	
	public KataNumbersToWords() {
		oneDigit.put(0, "zero");
		oneDigit.put(1, "one");
		oneDigit.put(2, "two");
		oneDigit.put(3, "three");
		oneDigit.put(4, "four");
		oneDigit.put(5, "five");
		oneDigit.put(6, "six");
		oneDigit.put(7, "seven");
		oneDigit.put(8, "eight");
		oneDigit.put(9, "nine");
		oneDigit.put(10, "ten");
		oneDigit.put(11, "eleven");
		oneDigit.put(12, "twelve");
		oneDigit.put(13, "thirteen");
		oneDigit.put(14, "fourteen");
		oneDigit.put(15, "fifteen");
		oneDigit.put(16, "sixteen");
		oneDigit.put(17, "seventeen");
		oneDigit.put(18, "eighteen");
		oneDigit.put(19, "nineteen");
		twoDigit.put(2, "twenty");
		twoDigit.put(3, "thirty");
		twoDigit.put(4, "fourty");
		twoDigit.put(5, "fifty");
		twoDigit.put(6, "sixty");
		twoDigit.put(7, "seventy");
		twoDigit.put(8, "eighty");
		twoDigit.put(9, "ninety");

		
	}

}

