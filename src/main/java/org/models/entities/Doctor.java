package org.models.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "Doctor")
public class Doctor extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "medicalLicense")
	private String medicalLicense;

	public Doctor() {}
	
	public Doctor(String username, String password) {
		super(username, password);
	}


	public Doctor(String username, String password, String name, String lastName, String personalAddress,
			String cellphone, String city, @Email String email, String cardNumber, String medicalLicense) {
		super(username, password, name, lastName, personalAddress, cellphone, city, email, cardNumber);
		this.medicalLicense = medicalLicense;
	}


	/* GETTERS Y SETTERS */
	public String getMedicalLicense() {
		return medicalLicense;
	}

	public void setMedicalLicense(String medicalLicense) {
		this.medicalLicense = medicalLicense;
	}
	
	

}
