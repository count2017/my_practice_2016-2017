package com.chinasofti.etc.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.chinasofti.etc.dao.WeiboDao;
import com.chinasofti.etc.model.User;
import com.chinasofti.etc.model.Weibo;
import com.chinasofti.etc.service.WeiboService;

public class WeiboServiceImpl implements WeiboService{
	private WeiboDao weiboDao;
	

	public WeiboDao getWeiboDao() {
		return weiboDao;
	}

	public void setWeiboDao(WeiboDao weiboDao) {
		this.weiboDao = weiboDao;
	}

	@Override
	public List<Weibo> queryall() {
		
		return weiboDao.queryall();
	}

	@Override
	public boolean addWeibo(Weibo wb,User user) {
		wb.setUser(user);
		wb.setAddtime(new Timestamp(new Date().getTime()));
		Boolean flag = weiboDao.addWeibo(wb);
		return flag;
	}

	@Override
	public boolean deleteWeibo(String id) {
		return weiboDao.deleteWeibo(id);
	}

	@Override
	public boolean updateWeibo(Weibo wb) {
		return weiboDao.updateWeibo(wb);
	}

	@Override
	public Weibo findWeiboById(String id) {
		return weiboDao.findWeiboById(id);
	}

}
