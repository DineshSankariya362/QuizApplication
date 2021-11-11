package com.Dinesh.Models;

public class Quiz {
	
	private Integer id;
	
	private String name;
	
	
	
	public Quiz() {
		super();
	}

	public Quiz( String name) {		
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
