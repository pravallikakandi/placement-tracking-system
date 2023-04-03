package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.IRPAdmin;
@Remote
public interface IRPAdminService {
	public IRPAdmin IRPAdminLogin(String iname,String ipwd);
}
