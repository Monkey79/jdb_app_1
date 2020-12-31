package com.mdangelo.jdbc_app_1.dao;

import java.util.List;

import com.mdangelo.jdbc_app_1.dtos.EmployeeDto;

public interface EmployeeDao extends BaseDao<EmployeeDto> {
	public List<EmployeeDto> findByDepartmentId(String id);

}
