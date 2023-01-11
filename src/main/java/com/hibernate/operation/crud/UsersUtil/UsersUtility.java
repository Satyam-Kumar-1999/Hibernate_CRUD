package com.hibernate.operation.crud.UsersUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsersUtility {

	public static final SessionFactory sessionFactory;
	static {
		try {
		Configuration systemConfig = new Configuration();
		systemConfig.configure("hibernate.configure.xml");
		sessionFactory = systemConfig.buildSessionFactory();
		}catch(Throwable th) {
			System.err.println("Initial SessionFactory failed to create "+th);
			throw new ExceptionInInitializerError(th);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
