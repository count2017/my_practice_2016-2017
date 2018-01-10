package com.chinasofti.etc.dao;

import com.chinasofti.etc.model.User;

public interface UserDao {
	boolean addUser(User user);
	User login(String username,String password);

}
