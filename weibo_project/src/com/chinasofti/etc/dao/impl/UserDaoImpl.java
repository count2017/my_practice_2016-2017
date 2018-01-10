package com.chinasofti.etc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.chinasofti.etc.dao.UserDao;
import com.chinasofti.etc.model.User;

public class UserDaoImpl implements UserDao{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return true;
	}

	@Override
	public User login(String username, String password) {
		User u = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User where username=? and password=?";
		Query query = session.createQuery(hql);
		query.setString(0, username);
		query.setString(1, password);
		List<User> list = query.list();
		if(list.size()>0){
			u = list.get(0);
		}
		return u;
	}

}
