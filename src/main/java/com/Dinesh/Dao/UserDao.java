package com.Dinesh.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
