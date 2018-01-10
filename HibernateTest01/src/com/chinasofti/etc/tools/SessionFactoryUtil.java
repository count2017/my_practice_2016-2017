package com.chinasofti.etc.tools;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static SessionFactory sf;
	private SessionFactoryUtil(){}
	public static SessionFactory getSessionFactory(){
		if(sf==null){
			//�����������ļ�
			Configuration config = new Configuration().configure();
			//��ȡsessionFactory����
			sf = config.buildSessionFactory();
		}
		return sf;
	}

}
