package com.Dinesh.Models;

public class User {
	
	private Integer id;
	
	private String fname;
	
	private String mname;
	
	private String lname;
	
	private Integer age;
	
	private String mobile;
	
	private String email;
	
	private String dob;
	
	

	public User() {
		
	}

	public User(String fname, String mname, String lname, Integer age, String mobile, String email, String dob) {
		
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.age = age;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", age=" + age
				+ ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
}
