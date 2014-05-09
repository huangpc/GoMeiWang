package com.gomei.dao;

import java.util.List;

import com.gomei.model.Hospital;

@SuppressWarnings("rawtypes")
public class HospitalDao extends BaseDao implements IHospitalDao {

	@SuppressWarnings("unchecked")
	public void add(Hospital hospital) {
		// TODO Auto-generated method stub
		super.add(hospital);
	}

	@SuppressWarnings("unchecked")
	public Hospital load(int id) {
		// TODO Auto-generated method stub
		return (Hospital) super.load(Hospital.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Hospital> list() {
		// TODO Auto-generated method stub
		return super.list(Hospital.class, null);
	}

}
