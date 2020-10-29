package com.bridgelabz.addressbook;

public class AddressBook {
	HashMap<String, Person> list = new HashMap<String, Person>();

	Scanner scanner = new Scanner(System.in);
	static AddressBook2 book = new AddressBook2();

	public static void main(String[] args) {
		book.getUserChoice();
	}

	private Person getUserInput() {
		System.out.print("Enter FirstName:");
		String FirstName = scanner.next();

		System.out.println("Enter LastName: ");
		String LastName = scanner.next();

		System.out.print("Enter Address: ");
		String Address = scanner.next();

		System.out.print("Enter City: ");
		String City = scanner.next();

		System.out.print("Enter State: ");
		String State = scanner.next();

		System.out.print("Enter ZipCode: ");
		String ZIPCode = scanner.next();

		System.out.print("Enter Mobile Number: ");
		String MobileNo = scanner.next();

		System.out.println("Enter Email Id:");
		String emailId = scanner.next();

		Person person = new Person();
		person.setFirstName(FirstName);
		person.setLastName(LastName);
		person.setAddress(Address);
		person.setCity(City);
		person.setZIPCode(ZIPCode);
		person.setState(State);
		person.setMobileNo(MobileNo);
		person.setEmailId(emailId);
		System.out.println(person);
		return person;
	}

	private void getUserChoice() {
		boolean isTerminate = false;
		while (!isTerminate) {
			System.out.println("1:Adding new person \n" + "2:Print address book \n" + "3:Exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				Person person = book.getUserInput();
				list.put(person.getEmailId(), person);
				break;

			case 2:
				System.out.println(list);
				break;

			case 3:
				isTerminate = true;
				break;
			default:
				System.out.println("please select valid option");
				break;
			}
		}

	}
}
