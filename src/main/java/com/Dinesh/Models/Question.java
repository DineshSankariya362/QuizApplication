package com.Dinesh.Models;

public class Question {
	
	private Integer id;
	
	private String question;
	
	private Integer qid;
	
	

	public Question() {
		super();
	}

	public Question(String question, Integer qid) {
		super();
		this.question = question;
		this.qid = qid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", qid=" + qid + "]";
	}
	
	
	
}
