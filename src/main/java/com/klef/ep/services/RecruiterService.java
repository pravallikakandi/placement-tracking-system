package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Recruiter;

@Remote
public interface RecruiterService {
	public String RecruiterRegistration(Recruiter r);
	public Recruiter RecruiterLogin(String rname,String rpwd);
}
