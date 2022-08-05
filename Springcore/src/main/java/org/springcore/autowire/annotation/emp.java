package org.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class emp {
	//dependency injection
	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting values: ");
		this.address = address;
	}
//display the value
	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
//default constructor
	public emp() {
		super();
	}

	//parameterized constructor
	public emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}
	
	

}
