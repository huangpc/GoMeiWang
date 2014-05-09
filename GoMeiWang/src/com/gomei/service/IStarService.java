package com.gomei.service;

import java.util.List;
import com.gomei.model.Star;

public interface IStarService {
	public Star load(int id);
	public void add(Star star);
	public List<Star> list();
	public List<Star> loadByType(int type);
}
