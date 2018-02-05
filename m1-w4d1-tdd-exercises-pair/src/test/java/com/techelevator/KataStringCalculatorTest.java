package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	public KataStringCalculator calc;
	@Before
	public void setup() {
		calc = new KataStringCalculator();
	}
	
	/*
	 * "" returns 0. check.
	 * "1" returns 1. check.
	 * "1,2" returns sum 3. 
	 * convert string to integer.
	 * 
	 * Passing multiple numbers to method returns their sum.
	 * method handles \n delimiter.
	 * method handles any delimiter (too big?)
	 */
	
	@Test
	public void empty_string_returns_0() {
		
		Assert.assertEquals(0, calc.add(""));
		
	}
	
	@Test
	public void convert_string_result_to_integer() {
		
		Assert.assertEquals(0, calc.add(""));
		Assert.assertEquals(-2, calc.add("-2"));
		Assert.assertEquals(20, calc.add("20"));
	}
	@Test
	public void addition_of_two_numbers_in_String() {
		
		Assert.assertEquals("Should return sum", 3, calc.add("1,2"));
		Assert.assertEquals("Should return sum", -5, calc.add("2,-7"));
		Assert.assertEquals("Should return sum", 50, calc.add("20,30"));
	}
	
	@Test
	public void method_adding_an_unknown_amount_of_numbers() {
		Assert.assertEquals("Should return sum", 23, calc.add("9,8,6"));
		Assert.assertEquals("Should return sum", -23, calc.add("-10,-20,7"));
		Assert.assertEquals("Should return sum", 0, calc.add("2,2,5,-9"));
	}
	
	@Test
	public void method_adding_an_unknown_amount_of_numbers_separated_by_newline() {
		Assert.assertEquals("Should return sum", 23, calc.add("9\n8\n6"));
		Assert.assertEquals("Should return sum", -23, calc.add("-10\n-20\n7"));
		Assert.assertEquals("Should return sum", 0, calc.add("2\n2\n5\n-9"));
	}
	
	@Test
	public void method_adding_an_unknown_amount_of_numbers_separated_by_any_delimiter() {
		Assert.assertEquals("Should return sum", 3, calc.add("//;\n1;2"));
		Assert.assertEquals("Should return sum", 13, calc.add("//!\n4!9"));
	}
	
	
	

}
