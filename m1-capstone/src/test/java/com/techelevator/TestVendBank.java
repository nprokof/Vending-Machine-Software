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
	@Test
	public void test() {
		bank.add(5);
		;
		Assert.assertEquals("response should be", "", bank.change());
	}

}
