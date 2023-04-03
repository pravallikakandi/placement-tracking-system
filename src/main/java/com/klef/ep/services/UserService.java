package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.User;

@Remote
public interface UserService 
{
	public String userRegistration(User u);
	public User userLogin(String uname,String pwd);
}
