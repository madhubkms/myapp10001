package com.herokuapp.myapp10001.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herokuapp.myapp10001.dao.StudentDao;
import com.herokuapp.myapp10001.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;	

	@Transactional
	public Student getStudent(int rollnumber) {
		return studentDao.getStudent(rollnumber);
	}

}
