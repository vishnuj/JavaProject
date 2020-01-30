package com.java.accountproject;

public class Address {
	private int appartmentNum;
	private String address;
	private String city;
	private String state;
	
	public Address(int appartmentNum, String address, String city, String state) {
		super();
		this.appartmentNum = appartmentNum;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public int getAppartmentNum() {
		return appartmentNum;
	}
	public void setAppartmentNum(int appartmentNum) {
		this.appartmentNum = appartmentNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [appartmentNum=" + appartmentNum + ", address=" + address + ", city=" + city + ", state="
				+ state + ", getAppartmentNum()=" + getAppartmentNum() + ", getAddress()=" + getAddress()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + "]";
	}

}
