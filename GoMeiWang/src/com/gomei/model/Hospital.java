package com.gomei.model;

public class Hospital {
	private int id;
	private String name;
	private String image;
	private String link;
	private String address;
	private String phone;
	private String aboutus;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAboutus() {
		return aboutus;
	}
	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", image=" + image
				+ ", link=" + link + ", address=" + address + ", phone="
				+ phone + ", aboutus=" + aboutus + "]";
	}
	
	
}
