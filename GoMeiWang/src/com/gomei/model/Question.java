package com.gomei.model;

import java.util.Date;

public class Question {
	private int id;
	private int user;
	private Date date;
	private String content;
	private String title;
	private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", user=" + user + ", date=" + date
				+ ", content=" + content + ", title=" + title + ", type="
				+ type + "]";
	}
	
	
}
