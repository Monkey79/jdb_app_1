package com.mdangelo.jdbc_app_1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mdangelo.jdbc_app_1.dao.BaseDao;
import com.mdangelo.jdbc_app_1.dtos.BaseDto;
import com.mdangelo.jdbc_app_1.dtos.DepartmentDto;
import com.mdangelo.jdbc_app_1.utils.ConnectionMng;

public class DepartmentImplDao implements BaseDao<DepartmentDto> {
	private Connection myConn;

	@Override
	public DepartmentDto findById(Long id) {
		

		return null;
	}

	@Override
	public List<DepartmentDto> findAll() {
		List<DepartmentDto> departmentDtos = new ArrayList<>();
		
		myConn = ConnectionMng.getConnection();
		PreparedStatement prStm = null;
		ResultSet rsSet = null;

		try {
			String query = "SELECT * FROM departments";
			prStm = myConn.prepareStatement(query);
			rsSet = prStm.executeQuery();
			
			while(rsSet.next()) {
				DepartmentDto dptDto = new DepartmentDto(rsSet.getLong("id"),rsSet.getString("dpt_id"),rsSet.getString("dpt_name"), new ArrayList<>());
				departmentDtos.add(dptDto);
			}
			return departmentDtos;

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				if (prStm != null) prStm.close();
				if (rsSet != null) rsSet.close();
			} catch (SQLException e) {				
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	@Override
	public DepartmentDto save(DepartmentDto obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentDto delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
