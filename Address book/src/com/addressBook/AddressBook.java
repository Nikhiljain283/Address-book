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

	public void editContact() {

		System.out.println("Enter the contact name you want to edit");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getFirstName()).equals(name)) {
				System.out.println("Enter 1 to edit first name");
				System.out.println("Enter 2 to edit last name");
				System.out.println("Enter 3 to edit Address");
				System.out.println("Enter 4 to edit city");
				System.out.println("Enter 5 to edit state");
				System.out.println("Enter 6 to edit pincode ");
				System.out.println("Enter 7 to edit Mobile number");
				System.out.println("Enter 8 to edit email");

				int check = sc.nextInt();

				switch (check) {
				case 1:
					System.out.println("Enter the new first name");
					String changeFirstName = sc.next();
					list.get(i).setFirstName(changeFirstName);
					System.out.println("updated");
					break;

				case 2:
					System.out.println("Enter the new last name");
					String changeLastName = sc.next();
					list.get(i).setLastName(changeLastName);
					System.out.println("updated");
					break;

				case 3:
					System.out.println("Enter the new address");
					String changeAddress = sc.next();
					list.get(i).setAddress(changeAddress);
					System.out.println("updated");
					break;

				case 4:
					System.out.println("Enter the new city");
					String changeCity = sc.next();
					list.get(i).setCity(changeCity);
					System.out.println("updated");
					break;

				case 5:
					System.out.println("Enter the new state");
					String changeState = sc.next();
					list.get(i).setState(changeState);
					System.out.println("updated");
					break;

				case 6:
					System.out.println("Enter the new pin code");
					int changePinCode = sc.nextInt();
					list.get(i).setZipcode(changePinCode);
					System.out.println("updated");
					break;

				case 7:
					System.out.println("Enter the new mobile number");
					long changeMobileNumber = sc.nextInt();
					list.get(i).setPhoneNumber(changeMobileNumber);
					System.out.println("updated");
					break;

				case 8:
					System.out.println("Enter the new email Id");
					String changeEmailId = sc.next();
					list.get(i).setEmail(changeEmailId);
					System.out.println("updated");
					break;

				}
			}
		}
	}

	public void deleteContact() {
		System.out.println("Enter the contact name you want to delete");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getFirstName()).equals(name)) {
				list.remove(i);
			}
		}
	}
}
