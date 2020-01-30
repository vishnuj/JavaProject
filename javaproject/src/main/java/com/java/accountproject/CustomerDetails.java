package com.java.accountproject;

public class CustomerDetails {
	private String name;
	private String email;
	private int age;
	private int accountId;
	private String phoneNumber;
	private Address customerAddress;
	private double acctBalance;
	
	public CustomerDetails(String name, String email, int age, int accountId, String phoneNumber,
			Address customerAddress, double acctBalance) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.accountId = accountId;
		this.phoneNumber = phoneNumber;
		this.customerAddress = customerAddress;
		this.acctBalance = acctBalance;
	}
	
	public CustomerDetails(String name, String email, int age, int accountId, String phoneNumber,
			Address customerAddress) {
		this(name, email, age, accountId, phoneNumber,
				customerAddress, 0.0);
	}
	
	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", email=" + email + ", age=" + age + ", accountId=" + accountId
				+ ", phoneNumber=" + phoneNumber + ", customerAddress=" + customerAddress + ", acctBalance="
				+ acctBalance + "]";
	}
	
	void deposit(double money) {
		this.acctBalance += money;
		System.out.println("Deposited - "+money+" Available Balance : "+this.acctBalance);
	}
	
	void withDraw(double money) {
		this.acctBalance -= money;
		System.out.println("Withdrawn - "+money+" Available Balance : "+this.acctBalance);
	}
	
}
