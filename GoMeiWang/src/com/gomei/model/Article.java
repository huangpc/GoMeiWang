package com.gomei.model;

import java.util.Date;

public class Article {
	private int id;
	private int author;
	private String title;
	private String content;
	private Date date;
	private int topicid;
	private int type;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTopic() {
		return topicid;
	}
	public void setTopic(int topicid) {
		this.topicid = topicid;
	}
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", author=" + author + ", title=" + title
				+ ", content=" + content + ", date=" + date + ", topic="
				+ topicid + "]";
	}
	
	
}
