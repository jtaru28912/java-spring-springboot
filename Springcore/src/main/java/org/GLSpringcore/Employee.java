package org.GLSpringcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String  name ;
	private List<String> phone;
	private Set<String> Address;
	private Map<String, String>courses;
	
	public Employee(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		Address = address;
		this.courses = courses;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", Address=" + Address + ", courses=" + courses + "]";
	}
}
