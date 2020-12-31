package com.mdangelo.jdbc_app_1.facade;

import java.util.List;

import com.mdangelo.jdbc_app_1.dao.BaseDao;
import com.mdangelo.jdbc_app_1.dao.EmployeeDao;
import com.mdangelo.jdbc_app_1.dao.impl.DepartmentImplDao;
import com.mdangelo.jdbc_app_1.dao.impl.EmployeeImplDao;
import com.mdangelo.jdbc_app_1.dtos.DepartmentDto;
import com.mdangelo.jdbc_app_1.dtos.EmployeeDto;

public class Facade {
	
	public List<DepartmentDto> getAllDepartments(){
		BaseDao<DepartmentDto> dptoDao = new DepartmentImplDao();
		return dptoDao.findAll();
	}
	
	public List<EmployeeDto> getEmployeeByDeptId(String id){
		EmployeeDao emplDao = new EmployeeImplDao();
		return emplDao.findByDepartmentId(id);
	}

}
