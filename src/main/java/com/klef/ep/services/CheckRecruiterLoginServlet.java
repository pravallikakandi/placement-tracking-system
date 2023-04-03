package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Recruiter;

@WebServlet("/checkrecruiter")
public class CheckRecruiterLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/PlacementTrackingProject/RecruiterServiceImpl!com.klef.ep.services.RecruiterService")
	RecruiterService recruiterService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String rname=request.getParameter("rname");
      String rpwd=request.getParameter("rpwd");
      
      Recruiter r = recruiterService.RecruiterLogin(rname, rpwd);
      
      if(r!=null)
      {
    	  out.println("Login Success");
      }
      else
      {
    	  out.println("Login Failed");
      }
  }
}