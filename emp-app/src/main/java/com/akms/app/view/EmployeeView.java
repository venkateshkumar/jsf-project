package com.akms.app.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.akms.app.dto.DepartmentDTO;
import com.akms.app.dto.EmployeeDTO;
import com.akms.app.model.Department;
import com.akms.app.repository.DepartmentRepository;
import com.akms.app.service.DepartmentService;
import com.akms.app.service.EmployeeService;



@ManagedBean
public class EmployeeView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long department;
	private String employeeName;
	private String employeeAddress;
	private List<DepartmentDTO> lstDeptTos;
	private List<EmployeeDTO> lstEmployeeTos;
	private EmployeeDTO selectedEmployeeDTO;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private EmployeeService employeeService;
	
	public List<EmployeeDTO> getLstEmployeeTos() {
		return lstEmployeeTos;
	}
	public void setLstEmployeeTos(List<EmployeeDTO> lstEmployeeTos) {
		this.lstEmployeeTos = lstEmployeeTos;
	}
	public List<DepartmentDTO> getLstDeptTos() {
		return lstDeptTos;
	}
	public void setLstDeptTos(List<DepartmentDTO> lstDeptTos) {
		this.lstDeptTos = lstDeptTos;
	}
	public Long getDepartment() {
		return department;
	}
	public void setDepartment(Long department) {
		this.department = department;
	}
	
	
	public void reset() {
		setEmployeeName("");
		setEmployeeAddress("");
		setDepartment(null);
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
	@PostConstruct
	public void init() {
		 lstDeptTos = departmentService.findAllDepartments();
		 lstEmployeeTos =employeeService.findAllEmployees();
	}
   
	/**
	 * Create a New Employee with the Department selection
	 */
	public void saveEmployee() {
		EmployeeDTO employeeDTO =new EmployeeDTO(null, getEmployeeName(), getEmployeeAddress(), new DepartmentDTO(getDepartment(),null));
		employeeService.saveOrUpdateEmployee(employeeDTO);
	}
	
	/**
	 * Deleting the existing Employee Record with ID
	 */
	public void deleteEmployee() {
		EmployeeDTO employeeDTO = employeeService.findByEmpId(selectedEmployeeDTO.getEmployeeId());
		employeeService.deleteEmployee(employeeDTO);
	}
	
	/**
	 * Updating the existing Employee record with ID
	 */
	public void updateEmployee() {
		EmployeeDTO employeeDTO = employeeService.findByEmpId(selectedEmployeeDTO.getEmployeeId());
		employeeDTO.setEmployeeName(getEmployeeName());
		employeeDTO.setEmployeeAddress(getEmployeeAddress());
		employeeDTO.setDepartmentDTO(new DepartmentDTO(getDepartment(), null));
		employeeService.saveOrUpdateEmployee(employeeDTO);
	}
	
	public EmployeeDTO getSelectedEmployeeDTO() {
		return selectedEmployeeDTO;
	}
	public void setSelectedEmployeeDTO(EmployeeDTO selectedEmployeeDTO) {
		this.selectedEmployeeDTO = selectedEmployeeDTO;
	}
}
