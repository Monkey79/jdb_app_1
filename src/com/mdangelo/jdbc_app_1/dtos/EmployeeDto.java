package com.mdangelo.jdbc_app_1.dtos;

public class EmployeeDto extends BaseDto {	
	
	private String empId;
	private String name;
	private String lastNane;
	private String email;
	
	private DepartmentDto departmenDto;

	public EmployeeDto(Long id,String empId, String name, String lastNane,String email, DepartmentDto departmenDto) {	
		super(id);
		this.empId = empId;
		this.name = name;
		this.lastNane = lastNane;
		this.email = email;
		this.departmenDto = departmenDto;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNane() {
		return lastNane;
	}

	public void setLastNane(String lastNane) {
		this.lastNane = lastNane;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DepartmentDto getDepartmenDto() {
		return departmenDto;
	}

	public void setDepartmenDto(DepartmentDto departmenDto) {
		this.departmenDto = departmenDto;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", name=" + name + ", lastNane=" + lastNane + ", email=" + email
				+ ", departmenDto=" + departmenDto + "]";
	}
}
