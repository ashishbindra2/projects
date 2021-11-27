package com.ashi.studentProject;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	StudentRepository repo = new StudentRepository();

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Student> getStudent() {
		System.out.println("GetStudent() is called....");
		return repo.getStudent();
	}
	
	@GET
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("id") int id) {
		return repo.getStudent(id);
	}
	
	@POST
	@Path("student")
	public Student createStudent(Student s1) {
		System.out.println(s1);
		repo.addNewStudent(s1);
		return s1;
	}
}
