package com.gomei.model;

public class Hottopic {
	private int id;
	private String title;
	private String intro;
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
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getArticle() {
		return article;
	}
	public void setArticle(int article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "Hottopic [id=" + id + ", title=" + title + ", intro=" + intro
				+ ", type=" + type + ", article=" + article + "]";
	}
	
	
}
