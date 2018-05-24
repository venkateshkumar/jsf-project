package com.akms.app.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	
	private Long employeeId;
	private String employeeName;
	private String employeeAddress;
	private DepartmentDTO departmentDTO;
	
	
	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}
	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	public EmployeeDTO(Long employeeId, String employeeName, String employeeAddress,DepartmentDTO departmentDTO) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.departmentDTO=departmentDTO;
		
	}
	public EmployeeDTO() {
		super();
	}
	
	
}
