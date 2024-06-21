package com.wipro.app;

import com.wipro.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

public class App {

	public static void main(String[] args) {
		try {
		 EntityManagerFactory emf= 
				Persistence.createEntityManagerFactory("JPA-Project");

		
	EntityManager entityManager=emf.createEntityManager();
	entityManager.getTransaction().begin();
	User user = new User(null,"admin","admin@123");
	entityManager.persist(user);
	System.out.println("User save to databas" );
	entityManager.getTransaction().commit();
		
		}catch(PersistenceException e) {
			e.printStackTrace();
		}
	}

}
