package com.test.javaproject;

/**
 * @author vn50lty
 *
 */
public class PersonDetails {
	private String name;
	private int age;
	private Address address;
	
	public PersonDetails(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", age=" + age + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
