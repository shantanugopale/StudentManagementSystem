package com.dao;

import java.util.List;

import com.model.Student;


public interface StudentDao {
	void saveStudent(Student stu);
	
	List<Student> getAllStudents();
	
}
