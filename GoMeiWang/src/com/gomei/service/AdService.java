package com.gomei.service;

import java.util.List;

import com.gomei.dao.IAdDao;
import com.gomei.model.Ad;

public class AdService implements IAdService {

	private IAdDao adDao;
	
	
	public IAdDao getAdDao() {
		return adDao;
	}

	public void setAdDao(IAdDao adDao) {
		this.adDao = adDao;
	}

	public Ad load(int id) {
		// TODO Auto-generated method stub
		return adDao.load(id);
	}

	public void add(Ad ad) {
		// TODO Auto-generated method stub
		adDao.add(ad);
	}

	public List<Ad> list() {
		// TODO Auto-generated method stub
		return adDao.list();
	}
	
	public List<Ad> loadByType(int type){
		return adDao.loadByType(type);
	}

}
