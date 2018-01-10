package com.chinasofti.etc.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import com.chinasofti.etc.dao.UserDao;
import com.chinasofti.etc.model.User;
import com.chinasofti.etc.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean addUser(User user) {
		user.setRegTime(new Timestamp(new Date().getTime()));
		boolean flag = userDao.addUser(user);
		return flag;
	}

	@Override
	public User login(String username, String password) {
		User u = userDao.login(username, password);
		return u;
	}

}
