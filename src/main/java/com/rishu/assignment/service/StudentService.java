package com.rishu.assignment.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rishu.assignment.model.Student;

public class StudentService {
	
	/*SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession(); 
	*/
	
	
	
	public String getAllMessage(){
	/*	session.beginTransaction();
		Student user=(Student)session.get(Student.class, 2);
		System.out.println("Username pulled up is "+user.getUserName());
		
		
		session.close();*/
		return "Mymessage from getmethod";
	}
	
	public String addMessage(){
		return "Post Works even now";
	}

}
