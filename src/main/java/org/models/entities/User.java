package org.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;

@MappedSuperclass
public abstract class User {
	
	@Column(name = "username")
	private String Username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "personalAddress")
	private String personalAddress;
	
	@Column(name = "cellphone")
	private String cellphone;
	
	@Column(name = "city")
	private String city;
	
	@Email
	@Column(name = "email")
	private String email;
	
	@Column(name = "cardNumber")
	private String cardNumber;
	
	public User() {}
	
	public User(String username, String password) {}
	
	public User(String username, String password, String name, String lastName, String personalAddress,
			String cellphone, String city, @Email String email, String cardNumber) {
		super();
		Username = username;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.personalAddress = personalAddress;
		this.cellphone = cellphone;
		this.city = city;
		this.email = email;
		this.cardNumber = cardNumber;
	}
}
