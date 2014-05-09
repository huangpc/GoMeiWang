package com.gomei.dao;

import java.util.List;

import com.gomei.model.Star;

public interface IStarDao {
	public void add(Star star);
	public Star load(int id);
	public List<Star> list();
	public List<Star> loadByType(int type);
}
