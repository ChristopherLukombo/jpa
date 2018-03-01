package org.csid.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.csid.entity.Employee;

public class CreateEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("hsqldb");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("Gopal");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
//		entitymanager.find(Employee.class, 1);
		System.out.println(entitymanager.toString());
		entitymanager.close();
		emfactory.close();
	}
	
}
