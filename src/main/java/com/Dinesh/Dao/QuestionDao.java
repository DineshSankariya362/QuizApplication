package com.Dinesh.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Dinesh.Models.Question;
import com.Dinesh.Models.Quiz;

public class QuestionDao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save_question(Question ques) {
		
		String sql = "insert into question(question,qid) values('"+ques.getQuestion()+"',"+ques.getQid()+")";
		return jdbcTemplate.update(sql);
		
		
	}
	
	public int update_question(Question ques) {
		String sql = "update question set question='"+ques.getQuestion()+"' where id="+ques.getId();
		return jdbcTemplate.update(sql);
	}
	
	public int delete_question(int id) {
		String sql = "delete from question where id="+id;
		return jdbcTemplate.update(sql);
	}
	
	public int delete_questions(int quizid) {
		String sql = "delete from question where qid="+quizid;
		return jdbcTemplate.update(sql);
	}
	
	public Question get_question(int id) {
		String sql = "select * from question where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Question>(Question.class));
		
	}
	
	public List<Question> getquestion(int quizid){
		
		String query = "select * from question where qid="+quizid;
		
		return jdbcTemplate.query(query, new RowMapper<Question>() {
			@Override
			public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Question q = new Question();
				
				q.setId(rs.getInt(1));
				q.setQuestion(rs.getString(2));
				q.setQid(rs.getInt(3));
				
				return q;
			}
		});
		
	}
			
		
		
	
}
