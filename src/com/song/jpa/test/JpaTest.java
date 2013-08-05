package com.song.jpa.test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.song.jpa.entities.Customer;

public class JpaTest {

	public static void main(String[] args) {
		// String persistenceUnitName : from persistence-unit name attribute in
		// persistence.xml
		EntityManager em = Persistence.createEntityManagerFactory("JPA_Test")
				.createEntityManager();
		// query db:
		List<Customer> list = em.createQuery("select c from Customer c",
				Customer.class).getResultList();
		// print result:
		for (Customer customer : list)
			System.out.println(customer.getId() + " : " + customer.getName()
					+ " : " + customer.getEmail());
	}
}
