package tr.com.huseyinaydin.dao.implementation;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import tr.com.huseyinaydin.pojo.Products;
import tr.com.huseyinaydin.pojo.User;

public class HibernateConnection {
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory doHibernateConnection(){
		if(sessionFactory != null){
			return sessionFactory;
		}
		Properties database = new Properties();
		database.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		database.setProperty("hibernate.connection.username", "root");
		database.setProperty("hibernate.connection.password", "toor");
		database.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/ActivemqDB?createDatabaseIfNotExist=true");
		database.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		database.setProperty("hibernate.hbm2ddl.auto", "update");
		database.setProperty("hibernate.show_sql", "true");
		
		Configuration cfg = new Configuration()
							.setProperties(database)
							.addPackage("tr.com.huseyinaydin.pojo")
							.addAnnotatedClass(Products.class)
							.addAnnotatedClass(User.class);
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		sessionFactory = cfg.buildSessionFactory(ssrb.build());		
		return sessionFactory;
	}
}