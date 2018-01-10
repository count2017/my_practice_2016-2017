package com.chinasofti.etc.tools;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static SessionFactory sf;
	private SessionFactoryUtil(){}
	public static SessionFactory getSessionFactory(){
		if(sf==null){
			//加载主配置文件
			Configuration config = new Configuration().configure();
			//获取sessionFactory对象
			sf = config.buildSessionFactory();
		}
		return sf;
	}

}
