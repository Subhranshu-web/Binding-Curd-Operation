package com.sp.in.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EmpTabDtl")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer empId;
	@Column(name = "Name")
	private String empName;
	@Column(name = "Sal")
	private Double empSal;
}
