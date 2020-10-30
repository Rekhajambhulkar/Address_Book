package com.bridgelabz.addressbook;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome in AddressBook Program");
		HashMap<String, AddressBook> list = new HashMap<String, AddressBook>();

		AddressBook familyAddressBook = new AddressBook();
		AddressBook friendsAddressBook = new AddressBook();
		list.put("Family", familyAddressBook);
		list.put("Friends", friendsAddressBook);

		while (true) {
			System.out.println("1: Family \n" + "2: Friend \n" + "3: Terminate the program");
			int selectedOption = scanner.nextInt();
			if (selectedOption == 1) {
				familyAddressBook.getUserChoice();
			} else if (selectedOption == 2) {
				friendsAddressBook.getUserChoice();
			} else if (selectedOption == 3) {
				break;
			}
		}
	}
}
