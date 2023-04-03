package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Student;

@WebServlet("/studentreg")
public class StudentRegServlet extends HttpServlet
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
      String sgender=request.getParameter("sgender");
      String sdob=request.getParameter("sdob");
      String saddress=request.getParameter("saddress");
      String sprogram=request.getParameter("sprogram");
      String sdept=request.getParameter("sdept");
      String sphonenum=request.getParameter("sphonenum");
      
      Student s=new Student();
      s.setSname(sname);
      s.setSpwd(spwd);
      s.setSgender(sgender);
      s.setSdob(sdob);
      s.setSaddress(saddress);
      s.setSprogram(sprogram);
      s.setSdept(sdept);
      s.setSphonenum(sphonenum);
      System.out.println(s.toString());
      String result=studentService.StudentRegistration(s);
      out.println(result);
  }
}