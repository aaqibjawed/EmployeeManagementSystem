package com.example.springbootproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootproj.model.Employee;
import com.example.springbootproj.repository.repository;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {

	@Autowired
	private repository repo;

		
	@GetMapping({"/"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("employees", repo.findAll());
		return mav;
	}
	@GetMapping("/addEmployee")
	public String add()
	{
		return "addemployee";
	}
	
	@PostMapping("/addEmp")
	public String add(@ModelAttribute Employee emp)
	{
		repo.save(emp);
		return "redirect:/";
	}
	
	@GetMapping("/updateEmployee")
	public String updateEmployee() {
		
		return "updateEmployee";
	}
	@PostMapping("/updateEmployeeData")
	public String updateEmployeeData(@ModelAttribute Employee emp) {
		ModelAndView mv  = new ModelAndView("updateEmployee");
		mv.addObject("employee", repo.findById(emp.getEmp_no()));
		return "redirect:/updateEmployee/"+emp.getEmp_no();
	}
	
	@GetMapping("/updateEmployee/{id}")
	public ModelAndView updateEmployeeData(@ModelAttribute("id") String id) {
		ModelAndView mv = new ModelAndView("updateEmployee");

		try {
			Employee empl = new Employee();
			
			mv.addObject("Employee",repo.findById(id).get());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return mv;
	}
	@PostMapping("/deleteEmployeeData")
	public String deleteEmployeeData(@ModelAttribute Employee emp) {
		repo.deleteById(emp.getEmp_no());
		return "redirect:/";
	}
	
	@GetMapping("/viewEmployee")
	public String viewEmployee() {
		
		return "viewEmployee";
	}
	@PostMapping("/viewEmp")
	public ModelAndView viewEmpl(@ModelAttribute Employee empl) {
		ModelAndView mv  = new ModelAndView("viewEmployee");
		Employee emp = new Employee();
		emp = repo.findById(empl.getEmp_no()).get();
		mv.addObject("Employee", emp);
		
		return mv;
	}
	
	
	
}
