package com.java.accountproject;

public abstract class CustomerActions{
	abstract void deposit(double money);
	abstract void withdraw(double money);
	abstract void checkBalance(int accoutId);
	abstract void updateEmail(String email, int accountId);
	abstract void getContactDetails(int accountId);
}
