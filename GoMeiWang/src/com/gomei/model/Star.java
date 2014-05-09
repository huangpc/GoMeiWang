package com.gomei.model;

public class Star {
	private int id;
	private String name;
	private String title;
	private String image;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Star [id=" + id + ", name=" + name + ", title=" + title
				+ ", image=" + image + ", type=" + type + "]";
	}
	
	
	
	
}
