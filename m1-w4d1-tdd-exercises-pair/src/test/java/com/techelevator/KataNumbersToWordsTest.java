package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataNumbersToWordsTest {
	
	/*
	 * 1 digit numbers (zero, three, seven)
	 * 2 digit numbers (ten, fourteen, twenty-six)
	 * 3 digit numbers (two hundred and nine, three hundred, four hundred and ninety-eight)
	 * 4 digit numbers (three thousand and four, five thousand and twenty-six, seven thousand and one hundred and eleven)
	 * 5 digit numbers (forty thousand, eighty-seven thousand and six hundred and fifty-four)
	 * 6 digit numbers (five hundred thousand, eight hundred and three thousand and three hundred and eight, nine hundred and ninety-nine thousand and nine-hundred and ninety-nine)
	 */
	
	private KataNumbersToWords ntn;
	
	@Before
	public void setup() {
		ntn = new KataNumbersToWords();
	}
	
	@Test
	public void return_one_digit_number_in_words() {
		Assert.assertEquals("zero", ntn.converterToWords(0));
		Assert.assertEquals("three", ntn.converterToWords(3));
		Assert.assertEquals("seven", ntn.converterToWords(7));
	}
	@Test
	public void return_two_digit_10s_in_words() {
		Assert.assertEquals("twenty", ntn.converterToWords(20));
		Assert.assertEquals("fourty", ntn.converterToWords(40));
		Assert.assertEquals("eighty", ntn.converterToWords(80));
	}
	
	@Test
	public void return_two_digit_number_in_words() {
		Assert.assertEquals("ten", ntn.converterToWords(10));
		Assert.assertEquals("fourteen", ntn.converterToWords(14));
		Assert.assertEquals("twenty-six", ntn.converterToWords(26));
		Assert.assertEquals("seventy-three", ntn.converterToWords(73));
	}
	
	@Test
	public void return_three_digit_number_in_words() {
		Assert.assertEquals("two hundred and nine", ntn.converterToWords(209));
		Assert.assertEquals("three hundred", ntn.converterToWords(300));
		Assert.assertEquals("four hundred and ninety-eight", ntn.converterToWords(498));
		Assert.assertEquals("four hundred and twelve", ntn.converterToWords(412));
	}
	
	@Test
	public void return_four_digit_number_in_words() {
		Assert.assertEquals("three thousand and four", ntn.converterToWords(3004));
		Assert.assertEquals("five thousand and twenty-six", ntn.converterToWords(5026));
		Assert.assertEquals("seven thousand and one hundred and twelve", ntn.converterToWords(7112));
	}
	
	@Test
	public void return_five_digit_number_in_words() {
		Assert.assertEquals("fourty thousand", ntn.converterToWords(40000));
		Assert.assertEquals("eighteen thousand", ntn.converterToWords(18000));
		Assert.assertEquals("eighty-seven thousand and six hundred and fifty-four", ntn.converterToWords(87654));
	}

}
