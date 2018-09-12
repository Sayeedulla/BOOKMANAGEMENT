package com.mindtree.BookManagement.Util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DbUtil {

	private DbUtil() {

		// TODO Auto-generated constructor stub
	}

	public static SessionFactory sessionfactory;

	public static SessionFactory createConnection() {

		if (sessionfactory == null) {

			final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures
					// settings
					// from
					// hibernate.cfg.xml
.build();
try {
sessionfactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
} catch (Exception ex) {
StandardServiceRegistryBuilder.destroy(registry);
}

		}
		return sessionfactory;

	}
}
