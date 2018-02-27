package cn.pengyi.domain;

import java.util.Date;

public class User {
	
	private String userId;
	private String username;
	private String password;
	private String confirmpassword;
	private int sex;
	private String email;
	private Date date;
	

	public User() {
		super();
	
	}
	public User(String username, String password,
			int sex, String email, Date date) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.date = date;
	}
	public User(String userId, String username, String password, int sex,
			String email, Date date) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
}
