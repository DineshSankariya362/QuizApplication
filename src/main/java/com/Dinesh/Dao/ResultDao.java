package com.Dinesh.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class ResultDao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
}
