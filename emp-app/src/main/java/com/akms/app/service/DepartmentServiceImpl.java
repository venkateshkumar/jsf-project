package com.akms.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akms.app.dto.DepartmentDTO;
import com.akms.app.model.Department;
import com.akms.app.repository.DepartmentRepository;

@Service(value="departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDTO> findAllDepartments() {
		// TODO Auto-generated method stub
		List<Department> lstDepartment =departmentRepository.findAll();
		List<DepartmentDTO> lstDepartmentDtos =new ArrayList<>();
		for(Department department :lstDepartment) {
			lstDepartmentDtos.add(new DepartmentDTO(department.getDeptId(), department.getDeptName()));
		}
		return lstDepartmentDtos;
	}

}
