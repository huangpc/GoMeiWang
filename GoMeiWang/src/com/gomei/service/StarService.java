package com.gomei.service;

import java.util.List;

import com.gomei.dao.StarDao;
import com.gomei.model.Star;

public class StarService implements IStarService {

	private StarDao starDao;
	
	
	
	public StarDao getStarDao() {
		return starDao;
	}

	public void setStarDao(StarDao starDao) {
		this.starDao = starDao;
	}

	
	
	public Star load(int id) {
		// TODO Auto-generated method stub
		return starDao.load(id);
	}

	public void add(Star star) {
		// TODO Auto-generated method stub
		starDao.add(star);
	}

	public List<Star> list() {
		// TODO Auto-generated method stub
		return starDao.list();
	}
	
	public List<Star> loadByType(int type){
		return starDao.loadByType(type);
	}

}
