package e26.phonesearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Contacts {

	private Person person;
	private Set<Person> contacts;

	public Contacts() {
		this.person = new Person();
		this.contacts = new HashSet<Person>();
	}

	// 1
	public void addContacts(Person person) {
		contacts.add(person);
	}

	// 2
	public String personSearch(String name) {
		for (Person p : contacts) {
			if (p.getName().equals(name)) {
				int playerNumber = p.getNumber();
				String playerNumberS = Integer.toString(playerNumber);
				return playerNumberS;
			}
		}
		return "Not found";

	}

	// 3
	public String searchByNumber(int number) {
		for (Person p : contacts) {
			if (p.getNumber() == number) {
				return p.getName();
			}
		}
		return "Not found";
	}

	// 4
	public void addAddress(String name, String street, String city) {
		for (Person p : contacts) {
			if (p.getName().equals(name)) {
				p.setAddress(street + " " + city);
			}
		}
	}

	// 5
	public String searchAddressByName(String name) {
		String output = "";
		for (Person p : contacts) {
			if (p.getName().equals(name)) {
				if (p.getNumber() != 0) {
					output += "Number: " + p.getNumber() + "\n";
				} else if (p.getNumber() == 0) {
					output += "Number: not found \n ";
				}
				if (p.getAddress() != null) {
					output += "Address: " + p.getAddress() + "\n";
				} else if (p.getAddress() == null) {
					output += "Address: not found \n";
				}

			}

		}
		return output;

	}

	// 6
	public String deleteContact(String name) {
		for (Person p : contacts) {
			if(p.getName().equals(name)) {
				 contacts.remove(p);
				 return "Deleted \n";
			} 
			}
		return "Not Found";
	}

	//7
	public String searchAll(String name) {
		for (Person p : contacts) {
			if(p.getName().contains(name) ||p.getAddress() != null && p.getAddress().contains(name)) {
				return p.getName() + "\n" + searchAddressByName(p.getName());
			}
		}
		
		return "Keyword not found";
	}
}
