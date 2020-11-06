package com.bridgelabz.addressbook;

public class AddressBook {
	HashMap<String, Person> list = new HashMap<String, Person>();

	Scanner scanner = new Scanner(System.in);
	static AddressBook2 book = new AddressBook2();

	public void getUserChoice() {
        boolean isTerminate = false;
        while (!isTerminate) {
            System.out.println("1: Adding new person \n" +
                    "2: Update person \n" +
                    "3: Print address book \n" +
                    "4: Delete \n" +
		    "5: Search CityOrState \n" +
                    "6: Exit");
            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                    Person person = addressBook.getUserInput();
                    contactList.put(person.getEmailId(), person);
                    break;
                case 2:
                    addressBook.updateContact();
                    break;
                case 3:
                    System.out.println(contactList);
                    break;
                case 4:
                    addressBook.deletePerson();
                    break;
                case 5:
                    searchByCityOrState();
		    break();
		case 6:
		    isTerminate = true;
                    break;
                default:
                    System.out.println("please select valid option");
                    break;
            }
        }
    }

	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}

	private void updateContact() {
		System.out.println("Enter EmailId to update");
		String EmailId = scanner.next();

		if (list.containsKey(EmailId) == false) {
			System.out.println("provided email Id is wrong !");
			updateContact();
		}

		Person person = list.get(EmailId);
		System.out.println("1: First name \n" + "2: Last Name \n" + "3: Address \n" + "4: City \n" + "5: State \n"
				+ "6: ZipCode \n " + "7: MobileNumber");

		int selectedOption = scanner.nextInt();
		switch (selectedOption) {
		case 1:
			System.out.println("Enter First Name ");
			String FirstName = scanner.next();
			person.setFirstName(FirstName);
			break;
		case 2:
			System.out.println("Enter Last Name");
			String LastName = scanner.next();
			person.setLastName(LastName);
			break;
		case 3:
			System.out.println("Enter Address");
			String Address = scanner.next();
			person.setAddress(Address);
			break;
		case 4:
			System.out.println("Enter City");
			String City = scanner.next();
			person.setCity(City);
			break;
		case 5:
			System.out.println("Enter State");
			String State = scanner.next();
			person.setState(State);
			break;
		case 6:
			System.out.println("Enter Zip Code");
			String ZIPCode = scanner.next();
			person.setZIPCode(ZIPCode);
			break;
		case 7:
			System.out.println("Enter Phone Number");
			String MobileNo = scanner.next();
			person.setMobileNo(MobileNo);
			break;
		default:
			System.out.println("please select valid option");
			break;
		}
	}

		private void deletePerson() {
		System.out.println("Enter EmailId to delete");
		String EmailId = scanner.next();
		if (!list.containsKey(EmailId)) {
			System.out.println("Provided email Id is not found");
			deletePerson();
		}
		list.remove(EmailId);
		System.out.println("Deleted Successesfully.");
	}

		public void CountCityOrState() {
		int count = 0;
		System.out.println("Enter City:");
		String City = scanner.next();
		System.out.println("Enter State:");
		String State = scanner.next();
		System.out.println();
		for (Person person : contactList.values()) {

			if (person.getCity().contains(City) || person.getState().contains(State)) {
				count = count + 1;
			} else {
				System.out.println("Records not found");
			}
		}
		System.out.println("Number of count:"+count);
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

}
