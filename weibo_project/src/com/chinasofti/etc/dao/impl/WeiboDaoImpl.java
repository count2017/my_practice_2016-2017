package com.chinasofti.etc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.chinasofti.etc.dao.WeiboDao;
import com.chinasofti.etc.model.Weibo;

public class WeiboDaoImpl implements WeiboDao{
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Weibo> queryall() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Weibo");
		return query.list();
	}

	@Override
	public boolean addWeibo(Weibo wb) {
		Session session = sessionFactory.getCurrentSession();
		session.save(wb);
		return true;
	}

	@Override
	public boolean deleteWeibo(String id) {
		Session session = sessionFactory.getCurrentSession();
		Weibo wb = new Weibo();
		wb.setWeiboid(id);
		session.delete(wb);
		return true;
	}

	@Override
	public boolean updateWeibo(Weibo wb) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(wb);
		return true;
	}

	@Override
	public Weibo findWeiboById(String id) {
		Session session = sessionFactory.getCurrentSession();
		Weibo wb = (Weibo)session.get(Weibo.class, id);
		return wb;
	}

}
