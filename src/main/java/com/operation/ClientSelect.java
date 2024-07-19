  package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	//	Transaction tx=session.getTransaction();
		
		Book b1=session.load(Book.class, 1);
		System.out.println(b1);
	}
}
