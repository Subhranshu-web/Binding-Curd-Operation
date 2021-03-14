package com.sp.in.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.in.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
