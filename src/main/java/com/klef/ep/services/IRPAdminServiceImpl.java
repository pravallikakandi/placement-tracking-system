package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.IRPAdmin;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class IRPAdminServiceImpl implements IRPAdminService{
	public IRPAdmin IRPAdminLogin(String iname, String ipwd)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select IA from IRPAdmin IA where iname=? and  ipwd=?");
	    qry.setParameter(1, iname);
	    qry.setParameter(2, ipwd);
	    
	    IRPAdmin IA = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	IA = (IRPAdmin) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return IA;
		
	}
}
