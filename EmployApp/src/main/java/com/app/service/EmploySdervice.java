package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.repository.EmployRepository;

@Service
@Transactional
public class EmploySdervice {

	@Autowired
	private EmployRepository emprepo;
	
	public List<Employee> allEmployee(){
		System.out.println("inside allEmployee controleer");
		return emprepo.findAll();
	}
	 
	public Employee saveemployee(Employee eobj) {
	
		return emprepo.save(eobj);
	
	}

	
	
	
	
}
