package com.gomei.service;

import java.util.List;

import com.gomei.dao.IUserDao;
import com.gomei.model.User;

public class UserService implements IUserService {

	private IUserDao userDao;
	
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public User load(int id) {
		// TODO Auto-generated method stub
		return userDao.load(id);
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

}
