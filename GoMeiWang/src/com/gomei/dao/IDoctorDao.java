package com.gomei.dao;

import java.util.List;

import com.gomei.model.Doctor;

public interface IDoctorDao {
	public void add(Doctor doctor);
	public Doctor load(int id);
	public List<Doctor> list();
}
