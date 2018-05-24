package com.akms.app.dto;

import java.io.Serializable;

public class DepartmentDTO implements Serializable{

	private Long deptId;
	private String deptName;
	
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
	public DepartmentDTO(Long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public DepartmentDTO() {
		super();
	}
	
	
}
