package com.bridgelabz.addressbook;

public class AddressBook {
	private String first;
	private String last;
	private String address;
	private String City;
	private String State;
	private String ZIPCode;
	private String MobileNo;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZIPCode() {
		return ZIPCode;
	}

	public void setZIPCode(String zIPCode) {
		ZIPCode = zIPCode;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public static void main(String[] args) {
		System.out.println("Welcome in AddressBook Program");
	}

}
