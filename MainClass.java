package com.bridgelabz.addressbook;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	static Scanner scanner = new Scanner(System.in);
	static AddressBook familyAddressBook = new AddressBook();
	static AddressBook friendsAddressBook = new AddressBook();

	public static void main(String args[]) {

		HashMap<String, HashMap> addressBooks = new HashMap<String, HashMap>();// Stores Multiple Address Books
		HashMap<String, Person> contactlist = new HashMap<String, Person>();// Stores Single AddressBook

		AddressBook book = new AddressBook();

		// contactlist.put("Family", familyAddressBook);
		// contactlist.put("Friends", friendsAddressBook);

		while (true) {
			System.out.println("1: for family \n" + "2: for friend \n" + "3: To Search\n" + "4: Exit");
			int selectedOption = scanner.nextInt();

			switch (selectedOption) {
			case 1:
				contactlist = familyAddressBook.getUserChoice();
				addressBooks.put("Family", contactlist);
				break;
			case 2:
				contactlist = friendsAddressBook.getUserChoice();
				addressBooks.put("Friend", contactlist);
				break;
			case 3:
				search();
				break;
			case 4:
				System.out.println("\n\tTerminated");
				break;
			}
			if (selectedOption == 4)
				break;
		}
	}

	private static void search() {
		System.out.println("\n1.Search by City\n2.Search by State\n3.Count by City\\n4.Count by State");
		int search = scanner.nextInt();
		switch (search) {

		case 1:
			System.out.print("Enter City : ");
			String city = scanner.next();
			System.out.println("COntacts in " + city + " are");
			familyAddressBook.searchByCity(city);
			friendsAddressBook.searchByCity(city);
			break;
		case 2:
			System.out.print("Enter State : ");
			String state = scanner.next();
			System.out.println("COntacts in " + state + " are");
			familyAddressBook.searchByState(state);
			friendsAddressBook.searchByState(state);
			break;
		case 3:
		    	System.out.print("Enter City : ");
		    	String CityToCountContacts = scanner.next();
		    	Long noOfFamilyContactsInCity = familyAddressBook.countByCity(CityToCountContacts);
		    	Long noOfFriendsContactsInCity = friendsAddressBook.countByCity(CityToCountContacts);
		    	System.out.println("\nNo of Contacts in "+CityToCountContacts+" are "+(noOfFamilyContactsInCity+noOfFriendsContactsInCity));
		    	break;
		case 4:
		    	System.out.print("Enter State : ");
		    	String StateToCountContacts = scanner.next();
		    	Long noOfFamilyContactsInState = familyAddressBook.countByState(StateToCountContacts);
		    	Long noOfFriendsContactsIntate = friendsAddressBook.countByState(StateToCountContacts);
		    	System.out.println("\nNo of Contacts in "+StateToCountContacts+" are "+(noOfFamilyContactsInState+noOfFriendsContactsIntate));
		    	break;
		default:
			System.out.println("\nInvalid Entry\n");
			break;
		}
	}

	private static void sort() { // Sorting

		System.out.println("\n1: Sort by First Name\n2: Sort by City\n3: Sort by State\n4: Sort by ZIP\n");
		int sortOption = scanner.nextInt();

		boolean ifNotSorted = false;
		while (!ifNotSorted) {
			switch (sortOption) {

			case 1: // Sorts by First Name
				System.out.println("\nSorted List of Contacts by First Name\n");
				familyAddressBook.sortByName();
				friendsAddressBook.sortByName();
				ifNotSorted = true;
				break;
			case 2: // Sorts by City
				System.out.println("\nSorted List of Contacts by City\n");
				familyAddressBook.sortByCity();
				friendsAddressBook.sortByCity();
				ifNotSorted = true;
				break;
			case 3: // Sorts by State
				System.out.println("\nSorted List of Contacts by State\n");
				familyAddressBook.sortByState();
				friendsAddressBook.sortByState();
				ifNotSorted = true;
				break;
			case 4: // Sorts by ZIP
				System.out.println("\nSorted List of Contacts by ZIP\n");
				familyAddressBook.sortByZip();
				friendsAddressBook.sortByZip();
				ifNotSorted = true;
				break;
			default:
				System.out.println("Enter Correct Option\n");
				sortOption = scanner.nextInt();
				break;
			}
		}
	}
}
