package com.techelevator.Inventory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.techelevator.VendBank;

public class Inventory {

	Map<String, Popper> prodMap = new HashMap<String, Popper>();
	Candy candy = new Candy();
	Chips chips = new Chips();
	Beverage beverage = new Beverage();
	Gum gum = new Gum();
	
	AOne a1 = new AOne();
	ATwo a2 = new ATwo();
	AThree a3 = new AThree();
	AFour a4 = new AFour();
	BOne b1 = new BOne();
	BTwo b2 = new BTwo();
	BThree b3 = new BThree();
	BFour b4 = new BFour();
	COne c1 = new COne();
	CTwo c2 = new CTwo();
	CThree c3 = new CThree();
	CFour c4 = new CFour();
	DOne d1 = new DOne();
	DTwo d2 = new DTwo();
	DThree d3 = new DThree();
	DFour d4 = new DFour();
	
	public Inventory() {
		prodMap.put("A1", a1);
		prodMap.put("A2", a2);
		prodMap.put("A3", a3);
		prodMap.put("A4", a4);
		prodMap.put("B1", b1);
		prodMap.put("B2", b2);
		prodMap.put("B3", b3);
		prodMap.put("B4", b4);
		prodMap.put("C1", c1);
		prodMap.put("C2", c2);
		prodMap.put("C3", c3);
		prodMap.put("C4", c4);
		prodMap.put("D1", d1);
		prodMap.put("D2", d2);
		prodMap.put("D3", d3);
		prodMap.put("D4", d4);
	}
	
	public int stackSize(String input) {
		return (prodMap.get(input).sizeIt());
	}
	
	public boolean slotCheck(String input) {
		return prodMap.containsKey(input);
	}
	
	public void makePurchase(String input) {
		prodMap.get(input).popIt();
	}
	
	public double debitBal(String input) {
		return (prodMap.get(input).priceIt());
	}
	
	public String piggyPal(String input) {
		
		if (prodMap.get(input) instanceof Candy) {
			return candy.makeNoise();
		}
		if (prodMap.get(input) instanceof Chips) {
			return chips.makeNoise();
		}
		if (prodMap.get(input) instanceof Beverage) {
			return beverage.makeNoise();
		}
		if (prodMap.get(input) instanceof Gum) {
			return gum.makeNoise();
		}
		return null;
	}
	
	public String snackName(String input) {
		return (prodMap.get(input).nameIt());
	}

}
