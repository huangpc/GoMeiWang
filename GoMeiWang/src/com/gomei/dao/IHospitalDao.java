package com.gomei.dao;

import java.util.List;

import com.gomei.model.Hospital;

public interface IHospitalDao {
	public void add(Hospital hospital);
	public Hospital load(int id);
	public List<Hospital> list();
}
