package com.mdangelo.jdbc_app_1.dao;

import java.util.List;

import com.mdangelo.jdbc_app_1.dtos.BaseDto;

public interface BaseDao<T extends BaseDto> {	
	public T findById(Long id);
	public List<T> findAll();
	public T save(T obj);
	public T delete(Long id);

}
