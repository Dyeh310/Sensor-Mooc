package e26.phonesearch;

import java.util.Scanner;

public class UserInterface {

	private boolean running;
	private Scanner reader;
	private Contacts contacts;

	public UserInterface() {
		this.running = true;
		this.reader = new Scanner(System.in);
		this.contacts = new Contacts();
	}

	public void start() {

		contacts.addContacts(new Person("pekka", 5));
		contacts.addContacts(new Person("bob", 6));

		while (running) {
			
			System.out.println("Phone Search: ");
			try {
			System.out.println("Available Operations: \n" + " 1 add a number \n" + " 2 search for a number \n"
					+ " 3 search for a person by phone number \n" + " 4 add an address \n"
					+ " 5 search for person information \n" + " 6 delete personal information \n"
					+ " 7 filitered listing \n" + " 8 quit");
			
			int answer = Integer.parseInt(reader.nextLine());

			// Main block
			if (answer == 1) {
				System.out.println("Command: " + answer);
				System.out.println("Whose number: ");
				String name = reader.nextLine();
				System.out.println("Number: ");
				int number = Integer.parseInt(reader.nextLine());
				contacts.addContacts(new Person(name, number));

				// I believe the issue lies here
			} else if (answer == 2) {
				System.out.println("Command: " + answer);
				System.out.println("Whose number: ");
				String name = reader.nextLine();
				System.out.println(contacts.personSearch(name));

			} else if (answer == 3) {
				System.out.println("Command: " + answer);
				System.out.println("Number?");
				int number = Integer.parseInt(reader.nextLine());
				System.out.println(contacts.searchByNumber(number));

			} else if (answer == 4) {
				System.out.println("Command: " + answer);
				System.out.println("Whose address: ");
				String name = reader.nextLine();
				System.out.println("Street?");
				String street = reader.nextLine();
				System.out.println("City?");
				String city = reader.nextLine();
				contacts.addAddress(name, street, city);
				System.out.println("Added");

			} else if (answer == 5) {
				System.out.println("Command: " + answer);
				System.out.println("Whose information?");
				String name = reader.nextLine();
				System.out.println(contacts.searchAddressByName(name));

			} else if (answer == 6) {
				System.out.println("Command: " + answer);
				System.out.println("Who would you like to remove?");
				String name = reader.nextLine();
				System.out.println(contacts.deleteContact(name));

			} else if (answer == 7) {
				System.out.println("Command: " + answer);
				System.out.println("Keyword: ");
				String name = reader.nextLine();
				System.out.println(contacts.searchAll(name));
				
			} else if (answer == 8) {
				System.out.println("Command " + answer);
				System.out.println("Quit");
				break;
			}
			
			

			} catch (Exception e) {
				System.out.println("Please enter from the following options");
			}

		} // End main Loop
	}
}
