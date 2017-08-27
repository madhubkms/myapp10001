package com.herokuapp.myapp10001.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.herokuapp.myapp10001.model.Student;
import com.herokuapp.myapp10001.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/student/{rollnumber}", method = RequestMethod.GET)
	@ResponseBody
	public Student getStudent(@PathVariable("rollnumber") int rollnumber) {
		return studentService.getStudent(rollnumber);
	}
}
