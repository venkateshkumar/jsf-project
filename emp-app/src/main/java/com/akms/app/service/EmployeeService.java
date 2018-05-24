package com.akms.app.service;

import java.util.List;

import com.akms.app.dto.EmployeeDTO;

public interface EmployeeService {
	
	public void saveOrUpdateEmployee(EmployeeDTO employeeDTO);
	public void deleteEmployee(EmployeeDTO employeeDTO);
	public EmployeeDTO findByEmpId(Long id);
	public List<EmployeeDTO> findAllEmployees();
	
}
