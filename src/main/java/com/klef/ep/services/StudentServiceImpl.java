package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Student;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class StudentServiceImpl implements StudentService
{

	@Override
	public String StudentRegistration(Student s) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(s);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	 
	    
	    return "Registration Success";
	}

	@Override
	public Student StudentLogin(String sname, String spwd) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select s from Student s where sname=? and  spwd=?");
	    qry.setParameter(1, sname);
	    qry.setParameter(2, spwd);
	    
	    Student s = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	s = (Student) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return s;
	}
	
	

}
