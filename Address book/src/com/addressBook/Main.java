package com.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to address book");

		AddressBook person = new AddressBook();

		person.addContact();
		person.printList();

		person.addContact();
		person.printList();

		person.addContact();
		person.printList();
		
		person.editContact();
		person.printList();

	}
}
