package com.akms.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akms.app.dto.DepartmentDTO;
import com.akms.app.dto.EmployeeDTO;
import com.akms.app.model.Department;
import com.akms.app.model.Employee;
import com.akms.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveOrUpdateEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		Employee employee =new Employee();
		employee.setId(employeeDTO.getEmployeeId());
		employee.setEmpName(employeeDTO.getEmployeeName());
		employee.setEmpAddress(employeeDTO.getEmployeeAddress());
		Department department =new Department();
		department.setDeptId(employeeDTO.getDepartmentDTO().getDeptId());
		employee.setDepartment(department);
		employeeRepository.save(employee);
	}

	@Override
	public void  deleteEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		Employee employee =new Employee();
		employee.setId(employeeDTO.getEmployeeId());
		employeeRepository.delete(employee);
	}

	@Override
	public EmployeeDTO findByEmpId(Long id) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findOne(id);
		EmployeeDTO employeeDTO =new EmployeeDTO(employee.getId(),employee.getEmpName(),employee.getEmpAddress(),new DepartmentDTO(employee.getDepartment().getDeptId(), employee.getDepartment().getDeptName()));
		return employeeDTO; 
	}

	@Override
	public List<EmployeeDTO> findAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> lstEmployees =employeeRepository.findAll();
		List<EmployeeDTO> employeeDTOs =new ArrayList<>();
		for(Employee employee :lstEmployees) {
			employeeDTOs.add(new EmployeeDTO(employee.getId(), employee.getEmpName(), employee.getEmpAddress(), new DepartmentDTO(employee.getDepartment().getDeptId(), employee.getDepartment().getDeptName())));
		}
		return employeeDTOs ;
	}

	

	
	
}
