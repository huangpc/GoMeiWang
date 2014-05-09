package com.gomei.service;

import java.util.List;

import com.gomei.dao.IHospitalDao;
import com.gomei.model.Hospital;

public class HospitalService implements IHospitalService {

	private IHospitalDao hospitalDao;
	
	
	public IHospitalDao getHospitalDao() {
		return hospitalDao;
	}

	public void setHospitalDao(IHospitalDao hospitalDao) {
		this.hospitalDao = hospitalDao;
	}

	public Hospital load(int id) {
		// TODO Auto-generated method stub
		return hospitalDao.load(id);
	}

	public void add(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalDao.add(hospital);
	}

	public List<Hospital> list() {
		// TODO Auto-generated method stub
		return hospitalDao.list();
	}

}
