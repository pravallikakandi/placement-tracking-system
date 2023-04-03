package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.User;

@WebServlet("/userreg")
public class UserRegServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/PlacementTrackingProject/UserServiceImpl!com.klef.ep.services.UserService")
	UserService userService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String uname=request.getParameter("uname");
      String pwd=request.getParameter("pwd");
      
      User u=new User();
      u.setUsername(uname);
      u.setPassword(pwd);
      System.out.println(u.toString());
      String result=userService.userRegistration(u);
      out.println(result);
  }
}