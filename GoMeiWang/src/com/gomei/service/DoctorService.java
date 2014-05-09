package com.gomei.service;

import java.util.List;

import com.gomei.dao.IDoctorDao;
import com.gomei.model.Doctor;

public class DoctorService implements IDoctorService {

	private IDoctorDao doctorDao;
	
	
	public IDoctorDao getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(IDoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	public Doctor load(int id) {
		// TODO Auto-generated method stub
		return doctorDao.load(id);
	}

	public void add(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDao.add(doctor);
	}

	public List<Doctor> list() {
		// TODO Auto-generated method stub
		return doctorDao.list();
	}

}
