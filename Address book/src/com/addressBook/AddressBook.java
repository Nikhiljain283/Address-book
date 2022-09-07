package com.addressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	ArrayList<PersonInfo> list = new ArrayList();

	Scanner sc = new Scanner(System.in);

	public void addContact() {

		System.out.println("Enter first name : ");
		String firstName = sc.next();

		System.out.println("Enter last name : ");
		String lastName = sc.next();

		System.out.println("Enter address : ");
		String address = sc.next();

		System.out.println("Enter city : ");
		String city = sc.next();

		System.out.println("Enter state : ");
		String state = sc.next();

		System.out.println("Enter zip code : ");
		int zipCode = sc.nextInt();

		System.out.println("Enter phone number : ");
		long phoneNumber = sc.nextLong();

		System.out.println("Enter email : ");
		String email = sc.next();

		PersonInfo contact = new PersonInfo(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
		list.add(contact);
	}

	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			PersonInfo person = list.get(i);
			System.out.println(person);
		}
		System.out.println(" ");
	}
}
