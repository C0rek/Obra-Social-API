package org.models.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "affiliates")

public class Affiliate extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	public Affiliate() {}
	
	public Affiliate(String username, String password) {
		super(username, password);
	}

	public Affiliate(String username, String password, String name, String lastName, String personalAddress,
			String cellphone, String city, @Email String email, String cardNumber) {
		super(username, password, name, lastName, personalAddress, cellphone, city, email, cardNumber);
	}
	
}