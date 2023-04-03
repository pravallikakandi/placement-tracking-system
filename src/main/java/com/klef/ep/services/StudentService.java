package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Student;

@Remote
public interface StudentService {
	public String StudentRegistration(Student s);
	public Student StudentLogin(String sname,String spwd);
}
