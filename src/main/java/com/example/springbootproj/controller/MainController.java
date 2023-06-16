package com.example.springbootproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootproj.model.Employee;
import com.example.springbootproj.repository.repository;

@Controller
public class MainController {

	@Autowired
	private repository repo;

	@GetMapping("/home")
	@ResponseBody
	public List<Employee> home()
	{
		System.out.println(repo.findAll());
		return repo.findAll();
	}
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("employees", repo.findAll());
		return mav;
	}
}
