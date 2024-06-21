package com.wipro.model;

public class User {

	private String emailid;
	private String password;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	
	
	
}
