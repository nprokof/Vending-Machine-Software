package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestVendBank {

	private VendBank bank;
	
	@Before
	public void setup() {
	bank = new VendBank();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test_addition() {
		bank.add(5);
		Assert.assertEquals("response should be 5.00", 5.00, bank.getBal(), 0.0000);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_subtraction() {
		bank.add(5);
		bank.subtract(2.50);
		Assert.assertEquals("response should be 5.00", 2.50, bank.getBal(), 0.0000);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_change() {
		bank.add(5);
		bank.subtract(1.50);
		Assert.assertEquals("\nYour change is: \n 14 Quarter(s)\n", "\n Your change is: \n 14 Quarter(s) \n" , bank.change());
	}

}
