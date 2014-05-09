package com.gomei.service;

import java.util.List;

import com.gomei.model.Hospital;

public interface IHospitalService {
	public Hospital load(int id);
	public void add(Hospital hospital);
	public List<Hospital> list();
}
