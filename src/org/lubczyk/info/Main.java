package org.lubczyk.info;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.lubczyk.info.domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		Employee employee = new Employee();
		employee.setFirstName("Jan Nowak");
		employee.setLastName("Nowak");
		employee.setSolary(3333.33);
		employee.setSolary2(new BigDecimal("12345.3"));
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
