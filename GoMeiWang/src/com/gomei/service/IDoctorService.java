package com.gomei.service;

import java.util.List;

import com.gomei.model.Doctor;

public interface IDoctorService {
	public Doctor load(int id);
	public void add(Doctor doctor);
	public List<Doctor> list();
}
