package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.User;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class UserServiceImpl implements UserService
{

	@Override
	public String userRegistration(User u) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(u);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	 
	    
	    return "Registration Success";
	}

	@Override
	public User userLogin(String uname, String pwd) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select u from User u where username=? and  password=?");
	    qry.setParameter(1, uname);
	    qry.setParameter(2, pwd);
	    
	    User u = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	u = (User) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return u;
	}

}
