package com.gomei.model;

import java.util.Date;

public class Topic {
	private int id;
	private String title;
	private String intro;
	private String content;
	private Date date;
	private String comment;
	private int type;
	private int article;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}

	
	public int getArticles() {
		return article;
	}
	public void setArticles(int article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", title=" + title + ", intro=" + intro
				+ ", content=" + content + ", date=" + date + ", comment="
				+ comment + ", type=" + type + ", articles=" + article + "]";
	}
	
}
