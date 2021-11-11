package com.Dinesh.Models;

public class Answer {
	
	private Integer id;
	
	private String content;
	
	private Integer quesid;
	
	private Boolean isCorrect;
	
	

	public Answer() {
		super();
	}



	public Answer(String content, Integer quesid, Boolean isCorrect) {
		super();
		this.content = content;
		this.quesid = quesid;
		this.isCorrect = isCorrect;
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getQuesid() {
		return quesid;
	}

	public void setQuesid(Integer quesid) {
		this.quesid = quesid;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}



	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + ", quesid=" + quesid + ", isCorrect=" + isCorrect + "]";
	}
	
	

}
