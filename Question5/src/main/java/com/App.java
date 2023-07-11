package com;

import java.util.Scanner;

//import javax.security.auth.login.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session =factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		customer c = new customer();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter CID");
		int CID  = sc.nextInt();
		
		System.out.println("Enter CNAME");
		String CNAME =sc.next();
		
		System.out.println("Enter PLACE");
		String PLACE =sc.next();
		
		System.out.println("Enter PAN");
		String PAN =sc.next();
		
	
		c.setCID(CID);
		c.setCNAME(CNAME);
		c.setPLACE(PLACE);
		c.setPAN(PAN);
		
		
		session.save(c);
		tx.commit();
		
		System.out.println("Data inserted Succesfully.....");
		
	}
	}
