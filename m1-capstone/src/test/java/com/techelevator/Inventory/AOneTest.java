package com.techelevator.Inventory;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AOneTest {
	
	private AOne aot;
	
	@Before
	public void setup() {
		aot = new AOne();
	}
	
	@Test 
	public void item_name_from_csv_file() {
		Assert.assertEquals("Should return item name from CSV file", "Potato Crisps", aot.getItemName());
	}

}
