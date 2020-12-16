package com.example.REST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Emp_manager {
	@Id
	@GeneratedValue
	
	@Column(name="Emp_ID")
	private int Emp_ID;
	
	@Column(name="LastName")
	private String LastName;
	
	@Column(name="FirstName")
	private String FirstName;
	
	@Column(name="Salary")
	private int Salary;
	
	@Column(name="Address")
	private String Address;
	
	
	public Emp_manager() {
		
	}


	public int getEmp_ID() {
		return Emp_ID;
	}


	public void setEmp_ID(int emp_ID) {
		Emp_ID = emp_ID;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}

}
