package org.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",nullable=false)
    @NotNull
	private Long id;
	@Column(name = "type", nullable = false)

	private String type;
	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")

	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(Long id, String type, String name, String password, String phone, String email) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public User() {
		super();
	}
	

}
