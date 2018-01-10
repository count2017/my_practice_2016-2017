package com.chinasofti.etc.dao;

import java.util.List;

import com.chinasofti.etc.model.Weibo;

public interface WeiboDao {
	List<Weibo> queryall();
	boolean addWeibo(Weibo wb);
	boolean deleteWeibo(String id);
	boolean updateWeibo(Weibo wb);
	Weibo findWeiboById(String id);

}
