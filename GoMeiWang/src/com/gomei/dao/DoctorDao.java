package com.gomei.dao;

import java.util.List;

import com.gomei.model.Doctor;



@SuppressWarnings("rawtypes")
public class DoctorDao extends BaseDao implements IDoctorDao {

	@SuppressWarnings("unchecked")
	public void add(Doctor doctor) {
		// TODO Auto-generated method stub
		super.add(doctor);
	}

	@SuppressWarnings("unchecked")
	public Doctor load(int id) {
		// TODO Auto-generated method stub
		return (Doctor) super.load(Doctor.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Doctor> list() {
		// TODO Auto-generated method stub
		return super.list(Doctor.class, null);
	}

}
