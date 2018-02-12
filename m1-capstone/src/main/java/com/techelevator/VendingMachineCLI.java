package com.techelevator;

import java.util.Scanner;

import com.techelevator.Inventory.BOne;
import com.techelevator.Inventory.Inventory;
import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Options";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS,
													   MAIN_MENU_OPTION_PURCHASE };
	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Submit payment";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Complete transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY,
			PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION };
	
	private Menu menu;
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	
	VendBank currentBank = new VendBank();
	ReadCSVLogic currentCsv = new ReadCSVLogic();
	Inventory productsInventory = new Inventory();
//	BOne Test = new BOne();
	
	//run - display main menu
	public void run() {
		
		while(true) {
			
			System.out.println("*******************************************");
			System.out.println("**       WELCOME TO VENDOMATIC-500       **");
			System.out.println("**                                       **");
			System.out.println("*******************************************");
			System.out.println("");
			System.out.println("Please choose from the following options:");
			
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.println(currentCsv.displayProd());
			} 
			else if(choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				purchaseMenu();
			}
		}
	}
	
	//purchase - display menu 2
	public void purchaseMenu() {
	
		while (true) {
			String choice = (String)menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
			
			
			if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
				System.out.print("\nEnter whole dollar amount >>> ");
				Scanner in  = new Scanner(System.in);
				double input = in.nextDouble();
				int dollarInput = (int) Math.round(input);
				if (dollarInput < 0) {
					System.out.println("\nNegative amounts are not valid. Please try again!");
					System.out.println("");
					System.out.println("");
					break;
				}
				
				//random eating of bills
				double random = (Math.random() * 100);
				if (random > 40.00 && random < 50.00) {
					System.out.println("ghrzhzzz... ghrzhzzz... ");
				
				}
				else {
					currentBank.add(dollarInput);
				}
			}
			else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
				//SELECT ID, call method from Inventory to print selection, call method from VendBank to print balance
				//select/input id
				//System.out.println(currentBank.getBal());
				System.out.print("\nEnter selection >>> ");
				Scanner in = new Scanner(System.in);
				String purchaseSelection = in.nextLine();
				productsInventory.makePurchase(purchaseSelection);
				currentBank.subtract(productsInventory.debitBal(purchaseSelection));
				System.out.println(productsInventory.debitBal(purchaseSelection));
				
//				System.out.println(Test.sizeIt());
				//if code does not exist - print error, go back to purchase menu
				//if a product is sold out - print message, go back to purchase menu
				//if a valid product is selected - print dispense message
				//call VendBank to update balance
				System.out.println("\n" + currentBank.getBal());
				purchaseMenu();
			}
			else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
				//call VendBank change() & call VendBank to verify/reset balance to $0
				System.out.println(currentBank.change());
				//call Inventory subclass piggyNoises()
				//exit program
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
		
	}
}
