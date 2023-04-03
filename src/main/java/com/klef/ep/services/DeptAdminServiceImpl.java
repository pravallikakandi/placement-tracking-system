package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.DeptAdmin;
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)

public class DeptAdminServiceImpl implements DeptAdminService
{

	@Override
	public DeptAdmin DeptAdminLogin(String dname, String dpwd)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select DA from DeptAdmin DA where dname=? and  dpwd=?");
	    qry.setParameter(1, dname);
	    qry.setParameter(2, dpwd);
	    
	    DeptAdmin DA = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	DA = (DeptAdmin) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return DA;
		
	}

}
