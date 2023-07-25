package com.example.springbootproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private String emp_no;
	private String first_name;
	private String last_name;
	private String Qualification;
	private String office;
	private String department;
	private String blood_group;
	private int exprience;
	private String phoneNumber;
	private String email;
	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String emp_no, String first_name, String last_name, String qualification, String office,
			String department, String blood_group, int exprience, String phoneNumber, String email, String address) {
		super();
		this.emp_no = emp_no;
		this.first_name = first_name;
		this.last_name = last_name;
		Qualification = qualification;
		this.office = office;
		this.department = department;
		this.blood_group = blood_group;
		this.exprience = exprience;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public int getExprience() {
		return exprience;
	}

	public void setExprience(int exprience) {
		this.exprience = exprience;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [emp_no=" + emp_no + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", Qualification=" + Qualification + ", office=" + office + ", department=" + department
				+ ", blood_group=" + blood_group + ", exprience=" + exprience + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", address=" + address + "]";
	}



}
