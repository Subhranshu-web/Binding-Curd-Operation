package com.sp.in.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.in.Entity.Employee;
import com.sp.in.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@PostMapping(value = "/save")
	public String saveEmp(@RequestBody Employee emp) {
		Integer saveEmp = employeeServiceImpl.saveEmp(emp);
		return "Employee Data Inserted Sucesssfully !!!" + saveEmp;
	}
	
	@GetMapping(value = "/getAll")
	public List<Employee> getData(){
		List<Employee> all = employeeServiceImpl.getAll();
		return all;
	}
	
	@GetMapping(value = "/findBy/{id}")
	public Optional<Employee> findByName(@PathVariable Integer id) {
		Optional<Employee> findName = employeeServiceImpl.findName(id);
		return findName;
	}
	
	
}
