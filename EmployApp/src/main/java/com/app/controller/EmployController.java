package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmploySdervice;

@RestController
@RequestMapping("/emp")
public class EmployController {

	@Autowired
	private EmploySdervice empservice;
	
	@GetMapping
	public List<Employee> getall(){
		return empservice.allEmployee();
	}
	
	@PostMapping("/empadd")
	public Employee saveEmploy(@RequestBody Employee 3eobj) {
		return empservice.saveemployee(eobj);
		
	}
	
}
