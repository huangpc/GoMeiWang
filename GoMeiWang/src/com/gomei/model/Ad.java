package com.gomei.model;

public class Ad {
	private int id;
	private String title;
	private String image;
	private int position;
	private String intro;
	private int type;
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
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
	@Override
	public String toString() {
		return "Ad [id=" + id + ", title=" + title + ", image=" + image
				+ ", position=" + position + ", intro=" + intro + ", type="
				+ type + "]";
	}
	

	
	
	
}
