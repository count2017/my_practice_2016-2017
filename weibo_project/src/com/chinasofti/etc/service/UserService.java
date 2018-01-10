package com.chinasofti.etc.service;

import com.chinasofti.etc.model.User;

public interface UserService {
	boolean addUser(User user);
	User login(String username,String password);

}
