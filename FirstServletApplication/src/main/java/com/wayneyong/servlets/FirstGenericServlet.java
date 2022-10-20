package com.wayneyong.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstGenericServlet extends GenericServlet{
	//Generic Servlet is an abstract class that implements Servlet interface, provides with default implementations


	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<h1>Hello World From Generic Servlet!</h1>");
		printWriter.print("<h1>Today is " + new Date() + "</h1>");
	}
	
	

}
