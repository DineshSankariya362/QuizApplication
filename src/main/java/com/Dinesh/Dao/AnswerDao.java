package com.Dinesh.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Dinesh.Models.Answer;

public class AnswerDao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save_question(Answer answer) {
		
		String query = "insert into answer(content,isCorrect,quesid) values('"+answer.getContent()+"',"+answer.getIsCorrect()+","+answer.getQuesid()+")";
		return jdbcTemplate.update(query);
		
	}
	
	public int delete_ans(int quesid) {
		
		String query = "delete from answer where quesid="+quesid;
		return jdbcTemplate.update(query);
	}
	
	public List<Answer> getans(int ques_id){
		String query = "select * from answer where quesid="+ques_id;
		
		return jdbcTemplate.query(query, new RowMapper<Answer>() {
			 @Override
			public Answer mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Answer ans = new Answer();
				ans.setId(rs.getInt(1));
				ans.setContent(rs.getString(2));
				ans.setIsCorrect(rs.getBoolean(3));
				ans.setQuesid(rs.getInt(4));
				 
				return ans;
			}
		});		
	}
}
