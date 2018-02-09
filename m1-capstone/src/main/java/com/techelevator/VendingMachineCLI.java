package com.techelevator;

import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS,
													   MAIN_MENU_OPTION_PURCHASE };
	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed me some money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY,
			PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION };
	
	private Menu menu;
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	
	//run - display main menu
	public void run() {
		while(true) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				//call method from Inventory to read CSV file
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
				//call method from VendBank to add to current balance
			}
			else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
				//SELECT ID, call method from Inventory to print selection, call method from VendBank to print balance
				//select/input id
				System.out.print("Enter selection");
				Scanner in = new Scanner(System.in);
				String purchaseSelection = in.nextLine();
				//if code does not exist - print error, go back to purchase menu
				//if a product is sold out - print message, go back to purchase menu
				//if a valid product is selected - print dispense message
				//call VendBank to update balance
				//return customer to purchase menu
			}
			else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
				//call VendBank change()
				//call VendBank to verify/reset balance to $0
				//call Inventory subclass piggyNoises()
			}
		}
	}
	
	
	public static void main(String[] args) {
		VendBank currectBank = new VendBank();
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
