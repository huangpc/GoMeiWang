package com.gomei.service;

import java.util.List;

import com.gomei.model.User;

public interface IUserService {
	public User load(int id);
	public void add(User user);
	public List<User> list();
}
