package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.DeptAdmin;

@Remote
public interface DeptAdminService {
	public DeptAdmin DeptAdminLogin(String dname,String dpwd);
}
