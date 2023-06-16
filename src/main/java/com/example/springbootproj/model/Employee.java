package com.example.springbootproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Double empNo;
	
	private String name;
	private String Qualification;
	private int exprience;
	private String phoneNumber;
	private String email;
	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Double empNo, String name, String qualification, int exprience, String phoneNumber, String email,
			String address) {
		super();
		this.empNo = empNo;
		this.name = name;
		Qualification = qualification;
		this.exprience = exprience;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public Double getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Double empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
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
		return "Employee [empNo=" + empNo + ", name=" + name + ", Qualification=" + Qualification + ", exprience="
				+ exprience + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
