package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.IRPAdmin;


@WebServlet("/checkirpadmin")
public class CheckIRPAdminLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/PlacementTrackingProject/IRPAdminServiceImpl!com.klef.ep.services.IRPAdminService")
	IRPAdminService irpadminService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String iname=request.getParameter("iname");
      String ipwd=request.getParameter("ipwd");
      
      IRPAdmin IA = irpadminService.IRPAdminLogin(iname, ipwd);
      
      if(IA!=null)
      {
    	  out.println("Login Success");
      }
      else
      {
    	  out.println("Login Failed");
      }
  }
}