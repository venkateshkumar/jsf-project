package com.akms.app.model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long deptId;
	
	@Column(name="department_name")
	private String deptName;
	
	@Column(name="department_desc")
	private String deptDesc;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="department")
	private List<Employee> employeeRecords =new ArrayList<>();
	
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public Department(String deptName, String deptDesc) {
		super();
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}
	public Department() {
		super();
	}
	
	
	public List<Employee> getEmployeeRecords() {
		return employeeRecords;
	}
	public void setEmployeeRecords(List<Employee> employeeRecords) {
		this.employeeRecords = employeeRecords;
	}
	
	
	
	
	
}
