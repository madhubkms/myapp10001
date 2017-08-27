package com.herokuapp.myapp10001.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.herokuapp.myapp10001.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public Student getStudent(int rollnumber) {
		Session session = this.sessionFactory.getCurrentSession();
		Student student = (Student) session.get(Student.class, new Integer(rollnumber));
		return student;
	}
}
