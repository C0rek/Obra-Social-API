package org.models.resources;

import java.util.List;

import org.models.entities.Doctor;
import org.models.services.DoctorService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/doctor")
@Transactional
public class DoctorResource {
	
	@Inject
	DoctorService doctorService;
	
	@GET
	@Path("/list")
	public Response listDoctors() {
		List<Doctor> doctorList = doctorService.listAllDoctors();
		if(doctorList.isEmpty()) {
			return Response.status(404).entity("There are not doctors in the DB").build();
		}
		return Response.ok(doctorList).build();
	}
	
	@POST
	@Path("/createDoctor")
	public Response createDoctor(Doctor newDoctor) {
		doctorService.createNewDoctor(newDoctor);
		return Response.ok().build();
	}

}
