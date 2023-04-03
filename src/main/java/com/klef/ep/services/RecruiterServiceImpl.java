package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Recruiter;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class RecruiterServiceImpl implements RecruiterService
{

	@Override
	public String RecruiterRegistration(Recruiter r) {
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
		    EntityManager entityManager = entityManagerFactory.createEntityManager();
		    
		    
		    entityManager.getTransaction().begin();
		    entityManager.persist(r);
		    entityManager.getTransaction().commit();
		    
		    entityManager.close();
		    entityManagerFactory.close();
		    
		 
		    
		    return "Registration Success";
		}
	

	@Override
	public Recruiter RecruiterLogin(String rname, String rpwd) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select r from Recruiter r where rname=? and  rpwd=?");
	    qry.setParameter(1, rname);
	    qry.setParameter(2, rpwd);
	    
	    Recruiter r = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	r = (Recruiter) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return r;
		
	}

	
	
	

}
