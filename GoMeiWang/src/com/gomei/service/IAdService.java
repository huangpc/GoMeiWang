package com.gomei.service;

import java.util.List;

import com.gomei.model.Ad;

public interface IAdService {
	public Ad load(int id);
	public void add(Ad ad);
	public List<Ad> list();
	public List<Ad> loadByType(int type);
}
