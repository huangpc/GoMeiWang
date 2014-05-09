package com.gomei.dao;

import java.util.List;

import com.gomei.model.User;

public interface IUserDao {
	public void add(User user);
	public User load(int id);
	public List<User> list();
}
