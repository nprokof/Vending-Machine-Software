package com.techelevator;

import java.io.IOException;
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
	Audit currentLog = new Audit();

	
	//run - display main menu
	public void run() throws IOException {
		
		while(true) {
			
			System.out.println("*******************************************");
			System.out.println("**       WELCOME TO VENDOMATIC-500       **");
			System.out.println("**                                       **");
			System.out.println("*******************************************");
			System.out.println("");
			System.out.println("Please choose from the following options:");
			
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.println("");
				System.out.println("Today's yummy options:");
				System.out.println("-----------------------");
				System.out.println("");
				System.out.println(currentCsv.displayProd());
			} 
			else if(choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				System.out.println("");
				System.out.println("-----------------------------------");
				purchaseMenu();
			}
		}
	}
	
	//purchase - display menu 2
	public void purchaseMenu() throws IOException {

		while (true) {
			String choice = (String)menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
			System.out.println("\nCurrent Balance: $" + currentBank.getBal());
			
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
					System.out.println("ghrzhzzz... ghrzhzzz... Thanks for the money, chump!");
				
				}
				else {
					currentBank.add(dollarInput);
				}
				double balance = currentBank.getBal();
				currentLog.logTransaction("FEED MONEY:", input, balance);
				System.out.println("\nCurrent Balance: $" + String.format( "%.2f", currentBank.getBal()));
			}
			else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
				
				//SELECT ID, call method from Inventory to print selection, call method from VendBank to print balance
				//select/input id
				System.out.print("\nEnter your purchase selection >>> ");
				Scanner in = new Scanner(System.in);
				String rawSelection = in.nextLine();
				String purchaseSelection = rawSelection.toUpperCase();
				
				
				//if code does not exist - print error, go back to purchase menu
				if (productsInventory.slotCheck(purchaseSelection) == false) {
					System.out.println("Product does not exist, please try again!");
				}
				if(productsInventory.stackSize(purchaseSelection) > 0 && currentBank.getBal() >= productsInventory.debitBal(purchaseSelection)) {
					productsInventory.makePurchase(purchaseSelection);
					
					//if a valid product is selected - print dispense message
					System.out.println("\nPrice of your item..., Piggy: $" + productsInventory.debitBal(purchaseSelection));
					System.out.println(productsInventory.piggyPal(purchaseSelection));
					
					//call VendBank to update balance
					currentBank.subtract(productsInventory.debitBal(purchaseSelection));
					double balance = currentBank.getBal();
					currentLog.logTransaction(productsInventory.snackName(purchaseSelection) + " " + purchaseSelection, productsInventory.debitBal(purchaseSelection) , balance);

				}
				else if(currentBank.getBal() < productsInventory.debitBal(purchaseSelection)) {
					System.out.println("You do not have enough funds, pauper!");
				}
				
				//if a product is sold out - print message, go back to purchase menu
				else {	
					System.out.println("That selection is SOLD OUT, uh doyEEEE!");
				}
			}
			
			else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
				
				//call VendBank change() & call VendBank to verify/reset balance to $0
				double balance = currentBank.getBal();
				currentLog.logTransaction("GIVE CHANGE: ", balance, 0.00d);
				System.out.println(currentBank.change());
				break;

			}
		} 
	}
	
	public static void main(String[] args) throws IOException {
		
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
		
	}
}
