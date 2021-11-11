package com.Dinesh.Models;

public class Result {
	
	private Integer id;
	
	private Integer quizid;
	
	private Integer userid;
	
	private Integer score;

	public Result(Integer quizid, Integer userid, Integer score) {
		super();
		this.quizid = quizid;
		this.userid = userid;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuizid() {
		return quizid;
	}

	public void setQuizid(Integer quizid) {
		this.quizid = quizid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", quizid=" + quizid + ", userid=" + userid + ", score=" + score + "]";
	}
	
	

}
