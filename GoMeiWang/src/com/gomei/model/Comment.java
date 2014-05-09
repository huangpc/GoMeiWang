package com.gomei.model;

import java.util.Date;

public class Comment {
	private int id;
	private int article;
	private int user;
	private Date date;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArticle() {
		return article;
	}
	public void setArticle(int article) {
		this.article = article;
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
	@Override
	public String toString() {
		return "Comment [id=" + id + ", article=" + article + ", user=" + user
				+ ", date=" + date + ", content=" + content + "]";
	}
	
	
}
