package com.chinasofti.etc.service;

import java.util.List;

import com.chinasofti.etc.model.User;
import com.chinasofti.etc.model.Weibo;

public interface WeiboService {
	List<Weibo> queryall();
	boolean addWeibo(Weibo wb,User user);
	boolean deleteWeibo(String id);
	boolean updateWeibo(Weibo wb);
	Weibo findWeiboById(String id);
}
