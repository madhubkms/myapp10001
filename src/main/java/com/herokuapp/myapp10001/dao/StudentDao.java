package com.herokuapp.myapp10001.dao;

import org.springframework.stereotype.Repository;

import com.herokuapp.myapp10001.model.Student;

public interface StudentDao {
	public Student getStudent(int rollnumber);
}
