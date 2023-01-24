package com.xworkz.Airconditioner.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.Airconditioner.Dto.AirconditionerDto;

public class AirconditionerConfig {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {

			Configuration config = new Configuration();

			Properties properties = new Properties();

			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/airconditioner");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Sathish@123@");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.SHOW_SQL, "true");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			//properties.put(Environment.HBM2DDL_AUTO, "create-drop");

			config.setProperties(properties);
			config.addAnnotatedClass(AirconditionerDto.class);
			ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

			sessionFactory = config.buildSessionFactory(service);

			return sessionFactory;

		}
		return sessionFactory;
	}

}
