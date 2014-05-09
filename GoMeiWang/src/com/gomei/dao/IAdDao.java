package com.gomei.dao;

import java.util.List;

import com.gomei.model.Ad;

public interface IAdDao {
	public void add(Ad ad);
	public Ad load(int id);
	public List<Ad> list();
	public List<Ad> loadByType(int type);
}
