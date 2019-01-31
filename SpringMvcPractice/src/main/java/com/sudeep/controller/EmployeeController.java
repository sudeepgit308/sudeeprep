package com.sudeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sudeep.bean.EmployeeBean;
import com.sudeep.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@RequestMapping("/addEmployee")
	public String showFormPage(Model model) {
		model.addAttribute("empBean",new EmployeeBean());
		return "addEmployee";
	}
	@PostMapping("/register")
	public String addEmployee(@ModelAttribute("empBean") EmployeeBean ebean,Model model) {
		ebean=empService.save(ebean);
		System.out.println(ebean);
		model.addAttribute("employeeList",ebean);
		
		return "showEmpList";
	} 
	
		

}
