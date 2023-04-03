package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Student;

@WebServlet("/checkstudent")
public class CheckStudentLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/PlacementTrackingProject/StudentServiceImpl!com.klef.ep.services.StudentService")
	StudentService studentService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String sname=request.getParameter("sname");
      String spwd=request.getParameter("spwd");
      
      Student s = studentService.StudentLogin(sname, spwd);
      
      if(s!=null)
      {
    	  out.println("Login Success");
      }
      else
      {
    	  out.println("Login Failed");
      }
  }
}