package com.Dinesh.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Dinesh.Models.Quiz;

public class QuizDao {
	
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Quiz get_quiz(int qid) {
		
		String sql = "select * from quiz where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {qid},new BeanPropertyRowMapper<Quiz>(Quiz.class));
	}
	
	public int save_quiz(Quiz quiz) {
		String sql="insert into quiz(name) values('"+quiz.getName()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public int update_quiz(Quiz quiz) {
		System.out.println(quiz.toString());
		String sql = "update quiz set name='"+quiz.getName()+"' where id="+quiz.getId();
		return jdbcTemplate.update(sql);
	}
	
	
	
	public int delete_quiz(int id) {
		
		String sql ="delete from quiz where id="+id;
		return jdbcTemplate.update(sql);
		
	}
	
	public List<Quiz> getallquiz(){
		String query = "select * from quiz";
		return jdbcTemplate.query(query,new RowMapper<Quiz>() {
			@Override
			public Quiz mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Quiz q = new Quiz();
				
				q.setId(rs.getInt(1));
				q.setName(rs.getString(2));
				
				return q;
			}
		});
	}
	
}
