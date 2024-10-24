package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentServiceIMPL implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	public void saveStudent(Student stu)
	{
		System.out.println("StudentService Called......"+stu);
		dao.saveStudent(stu);
	}

	public List<Student> loginCheck(String username, String password) {
		if (username.equals("Shantanu") && password.equals("1234")) {
			return dao.getAllStudents();  
		} else {
			return new ArrayList<Student>();
		}
	}
}
