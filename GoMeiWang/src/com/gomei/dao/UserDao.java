package com.gomei.dao;

import java.util.List;

import com.gomei.model.User;

@SuppressWarnings("rawtypes")
public class UserDao extends BaseDao implements IUserDao {

	@SuppressWarnings("unchecked")
	public void add(User user) {
		// TODO Auto-generated method stub
		super.add(user);
	}

	@SuppressWarnings("unchecked")
	public User load(int id) {
		// TODO Auto-generated method stub
		return (User) super.load(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> list() {
		// TODO Auto-generated method stub
		return super.list(User.class, null);
	}

}
