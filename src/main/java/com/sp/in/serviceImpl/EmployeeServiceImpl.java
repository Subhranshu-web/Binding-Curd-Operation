package com.sp.in.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.in.Entity.Employee;
import com.sp.in.Repository.EmployeeRepo;
import com.sp.in.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Integer saveEmp(Employee emp) {
		Employee save = empRepo.save(emp);
		Integer empId = save.getEmpId();
		return empId;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> findAll = empRepo.findAll();
		return findAll;
	}

	@Override
	public Optional<Employee> findName(Integer id) {
		Optional<Employee> findById = empRepo.findById(id);
		return findById;
	}

}
