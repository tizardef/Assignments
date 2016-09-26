package org.ssa.tiy.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Mainline {

	public static void main(String[] args) {
		
		updateMajorDescription();
		insertMajor();
		deleteMajor();
		select();
	}
	
	public static void updateMajorDescription() {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Major.class)
				.buildSessionFactory();
		Session session= factory.getCurrentSession();
		try{

			
			
			
			//begin transaction
					session.beginTransaction();
			//query 

			session.createQuery("update Major set description = 'Advanced Basket Weaving' where id=8").executeUpdate();
				
			//commit transaction	
					session.getTransaction().commit();
					
					
						
					
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			factory.close();
		}
	}

	private static void display(List<Major> majors) {
		for (Major major : majors) {
			System.out.println(major);
		}
	}
	
	
public static void deleteMajor() {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	Session session= factory.getCurrentSession();
	try{

//		//begin transaction
				session.beginTransaction();
//				
		session.createQuery("Delete Major where id=11").executeUpdate();

		//commit transaction
				session.getTransaction().commit();
//				
	}catch(Exception ex){
		ex.printStackTrace();
	}
	finally{
		factory.close();
	}
}

	
	
public static void insertMajor() {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	Session session= factory.getCurrentSession();
	try{
		
		Major mjr= new Major("Basket Weaving", 1200);
		Major mjr2= new Major("American Ninja Chess", 1600);
		Major mjr3= new Major("Renaissance Art of the Cirlce", 1200);
		Major mjr4= new Major("Don't Delete Me!", 777);
		//begin transaction
				session.beginTransaction();
				
				session.save(mjr);
				session.save(mjr2);
				session.save(mjr3);
				session.save(mjr4);
				System.out.println("New Major" + mjr);
				System.out.println("New Major" + mjr2);
				System.out.println("New Major" + mjr3);
				System.out.println("New Major" + mjr4);
				
		//commit transaction
				
				session.getTransaction().commit();
				
	}catch(Exception ex){
		ex.printStackTrace();
	}
	finally{
		factory.close();
	}
    }

public static void select() {
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	Session session= factory.getCurrentSession();
	try{

//		//begin transaction
				session.beginTransaction();
//				
				List<Major> majors = session.createQuery("From Major").list();

		//display
		System.out.println("ID   Major \t  \t \t            Required SAT Score \n");
		display(majors);
		
			
//				
		session.getTransaction().commit();
		
	}catch(Exception ex){
		ex.printStackTrace();
	}
	finally{
		factory.close();
	}
}



}

