package com.example.springbootproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootproj.model.Employee;

public interface repository extends JpaRepository<Employee, Double>{

	
}
