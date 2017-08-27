package com.herokuapp.myapp10001.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.herokuapp.myapp10001.dao.StudentDao;
import com.herokuapp.myapp10001.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	@Qualifier(value="studentDao")
	private StudentDao studentDao;	

	public Student getStudent(int rollnumber) {
		return studentDao.getStudent(rollnumber);
	}

}
