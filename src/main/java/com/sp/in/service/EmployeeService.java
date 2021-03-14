package com.sp.in.service;

import java.util.List;
import java.util.Optional;

import com.sp.in.Entity.Employee;

public interface EmployeeService {
	
	public Integer saveEmp(Employee emp);
	public List<Employee> getAll();
	public Optional<Employee> findName(Integer id);

}
