package com.assignment1.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory factory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {  	
    	try {
    		if (factory == null) {      		
        		Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
        		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
        		serviceRegistryBuilder.applySettings(configuration.getProperties());
        		ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
        		factory = configuration.buildSessionFactory(serviceRegistry);
    		}
    		return factory;
    	} catch(Throwable e) {
    		System.err.println("Initial session factory creation failed. " + e);
    		throw new ExceptionInInitializerError(e);
    	}
    }
    
    public static SessionFactory getSessionFactory() {
    	return factory;
    }
    
    public static void shutdown() {
    	getSessionFactory().close();
    }
}