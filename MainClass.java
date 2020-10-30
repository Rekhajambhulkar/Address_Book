package com.bridgelabz.addressbook;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome in AddressBook Program");
		HashMap<String, HashMap> list = new HashMap<String, HashMap>();
		AddressBook3 book = new AddressBook3();

		while (true) {
			book.getUserChoice();
		}
	}
}

