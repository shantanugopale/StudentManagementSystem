package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	private SessionFactory factory;

	public void saveStudent(Student stu) {

		System.out.println("StudentDao Called...");
		Session session = factory.openSession();
		session.save(stu);
		session.beginTransaction().commit();
		System.out.println("Records Save...");

	}

	public List<Student> getAllStudents() {

		Session session = factory.openSession();
		String hql = "from Student";
		Query query = session.createQuery(hql);
		return query.getResultList();
	}

}
