package org.student.manage;

//java POJO file
//--data , table , any information, database
public class Studentmodel {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	//constructor
	public Studentmodel(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	//student id is pk so it is auto increment so we need not to initialize it again and again
	public Studentmodel(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	//default constructor
	public Studentmodel() {
		
	}
	
	//getters and setters performing encapsulation
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Studentmodel [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone="
				+ studentPhone + ", studentCity=" + studentCity + "]";
	}
	
	
	

}
