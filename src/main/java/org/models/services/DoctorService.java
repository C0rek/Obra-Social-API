package org.models.services;

import java.util.List;

import org.models.entities.Doctor;
import org.models.repository.DoctorRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class DoctorService {
	
	@Inject
	DoctorRepository doctorRepository;
	
	public List<Doctor> listAllDoctors(){
		return doctorRepository.listAll();
	}
	
	public Response createNewDoctor(Doctor newDoctor) {
		doctorRepository.persist(newDoctor);
		return Response.ok().build();
	}

}
