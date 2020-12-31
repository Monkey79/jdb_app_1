package com.mdangelo.jdbc_app_1.dtos;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDto extends BaseDto {
	
	private String deptId;
	private String deptName;
	
	private List<EmployeeDto> employeesDto = new ArrayList<>();

	public DepartmentDto(Long id, String deptId, String deptName, List<EmployeeDto> employeesDto) {
		super(id);
		this.deptId = deptId;
		this.deptName = deptName;
		this.employeesDto = employeesDto;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<EmployeeDto> getEmployeesDto() {
		return employeesDto;
	}

	public void setEmployeesDto(EmployeeDto employeeDto) {
		this.employeesDto.add(employeeDto);
	}

	@Override
	public String toString() {
		return "DepartmentDto [deptId=" + deptId + ", deptName=" + deptName + ", employeesDto=" + employeesDto + "]";
	}

}
