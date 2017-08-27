package com.herokuapp.myapp10001.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="rollnumber")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollnumber;
	
	@Column(name="name")
	private String name;
	
	public Student(int rollnumber, String name) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
	}

	public int getRollnumber() {
		return rollnumber;
	}
	
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollnumber;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollnumber != other.rollnumber)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + "]";
	}
}
