package com.java.accountproject;

import java.util.HashMap;
import java.util.Map;

public class CustomerAccount {
	public static void main(String[] args) {
		Address address1 = new Address(307, "1103 Sullivan Square", "Bentonville", "AR");
		CustomerDetails customer1 = new CustomerDetails("Vishnu", "vishnu3090@gmail.com", 30, 123456, "4029992066", address1, 1234.56);
		
		Address address2 = new Address(12266, "12244 Franklin Plz", "Omaha", "NE");
		CustomerDetails customer2 = new CustomerDetails("Siva", "sikvahbk@gmail.com", 33, 78960, "95892066", address2);

		Map<Integer, CustomerDetails> customerHashMap = new HashMap<Integer, CustomerDetails>();
		customerHashMap.put(customer1.getAccountId(), customer1);
		customerHashMap.put(customer2.getAccountId(), customer2);
		
		customerHashMap.forEach((k,v) -> System.out.println(k+" ... "+v));
		
		customer1.deposit(100.34);
		customer2.deposit(200.94);
		
		customer2.withDraw(10.94);
		
		System.out.println("Customer 1 acct Bal : " + customer1.getAcctBalance());
		System.out.println("Customer 2 acct Bal : " + customer2.getAcctBalance());
	}
}
