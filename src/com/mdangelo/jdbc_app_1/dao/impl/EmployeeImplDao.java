package com.mdangelo.jdbc_app_1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mdangelo.jdbc_app_1.dao.EmployeeDao;
import com.mdangelo.jdbc_app_1.dtos.EmployeeDto;
import com.mdangelo.jdbc_app_1.utils.ConnectionMng;

public class EmployeeImplDao implements EmployeeDao{
	private Connection myConn;

	@Override
	public EmployeeDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDto save(EmployeeDto obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDto delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDto> findByDepartmentId(String id) {
		List<EmployeeDto>employeeDtos = new ArrayList<>();
		PreparedStatement prStm = null;
		ResultSet rsSet = null;
		try {
			myConn = ConnectionMng.getConnection();
			String query = "SELECT * FROM employees as empl WHERE empl.emp_dpt_id=? ";
			prStm = myConn.prepareStatement(query);
			prStm.setString(1, id);
			rsSet = prStm.executeQuery();
			
			while(rsSet.next()) {
				EmployeeDto emplDto = new EmployeeDto(rsSet.getLong("id"), rsSet.getString("emp_id"), 
						rsSet.getString("emp_name"), rsSet.getString("emp_last_name"),rsSet.getString("emp_email"), null);
				employeeDtos.add(emplDto);
				
			}			
			return employeeDtos;
			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}finally {
			try {
				if(prStm != null) prStm.close();
				if(rsSet != null) rsSet.close();
			} catch (Exception e2) {
				throw new RuntimeException(e2.getMessage());
			}
		}
		
	}
	
	

}
