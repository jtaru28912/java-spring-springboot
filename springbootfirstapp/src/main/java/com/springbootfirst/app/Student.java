package com.springbootfirst.app;
//POJO
public class Student {

	private String sFirstName;
	private String sLastName;
	//default constructor
	public Student() {
		super();
	}
	//parameterized 
	public Student(String sFirstName, String sLastName) {
		super();
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
	}
	//getter setter
	public String getsFirstName() {
		return sFirstName;
	}
	
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
//	//
	@Override
	public String toString() {
		return "Student [sFirstName=" + sFirstName + ", sLastName=" + sLastName + "]";
	}
	
}
