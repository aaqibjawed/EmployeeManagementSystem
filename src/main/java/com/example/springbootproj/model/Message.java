package com.example.springbootproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Message {
	@Id
	private String emp_no;
	private String first_name;
	private String last_name;
	private String phoneNumber;
	private String email;
	private String message;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String emp_no, String first_name, String last_name, String phoneNumber, String email,
			String message) {
		super();
		this.emp_no = emp_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.message = message;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
