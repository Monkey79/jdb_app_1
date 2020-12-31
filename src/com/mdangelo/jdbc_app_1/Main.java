package com.mdangelo.jdbc_app_1;

import java.util.List;

import com.mdangelo.jdbc_app_1.dtos.DepartmentDto;
import com.mdangelo.jdbc_app_1.dtos.EmployeeDto;
import com.mdangelo.jdbc_app_1.facade.Facade;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Main Class---");		
		showAllDepartmentsTest();
	}
	
	public static void showAllDepartmentsTest() {
		Facade facade = new Facade();
		List<DepartmentDto> departmentDtos = facade.getAllDepartments();
		
		
		for (DepartmentDto departmentDto : departmentDtos) {
			System.out.println(departmentDto);
			List<EmployeeDto> employeeDtos = facade.getEmployeeByDeptId(departmentDto.getDeptId());
			
			for (EmployeeDto employeeDto : employeeDtos) {
				System.out.println("\t"+employeeDto);
			}
		}
	}

}
