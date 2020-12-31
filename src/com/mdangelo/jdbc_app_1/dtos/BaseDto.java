package com.mdangelo.jdbc_app_1.dtos;

public abstract class BaseDto {
	protected Long  id;

	
	
	public BaseDto(Long id) {	
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseDto [id=" + id + "]";
	}

}
