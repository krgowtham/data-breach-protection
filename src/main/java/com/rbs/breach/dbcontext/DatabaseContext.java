package com.rbs.breach.dbcontext;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DatabaseContext {

	private SessionFactory sessionFactory = null;
	
	public SessionFactory buildSessionFactory(){
	
		try{
			Configuration configuration = new Configuration();
        	configuration.configure("hibernate.cfg.xml");
        	System.out.println("Hibernate Configuration loaded");
        	
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	System.out.println("Hibernate serviceRegistry created");
        	
        	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        	
			return sessionFactory;
			
		}catch(HibernateException e){
			
		}
		return sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		if(sessionFactory == null){
			sessionFactory = this.buildSessionFactory();
		}
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
