package com.rishu.assignment.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rishu.assignment.service.StudentService;
import com.rishu.assignment.model.Student;


@Path("/student")
public class StudentResource {
	
	StudentService studentService=new StudentService();
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return studentService.getAllMessage();
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String addMessage(){
		
		return studentService.addMessage();
	}
	
	
}
