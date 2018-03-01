package org.csid.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.csid.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("hsqldb");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, 1201);
		// before update
		System.out.println(employee);
		employee.setSalary(46000);
		entitymanager.getTransaction().commit();
		// after update
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();
	}
}
