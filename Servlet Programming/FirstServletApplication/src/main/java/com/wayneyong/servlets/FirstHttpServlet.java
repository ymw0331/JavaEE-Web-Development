package com.wayneyong.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet {
	// create a new feature that to the one that generic Servlet have, features are
	// doGet or doPost are identified

	private static final long serialVersionUID = -7027125098020330838L;

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter printWriter = res.getWriter();
//		printWriter.print("<h1>Hello World From Http Servlet!</h1>");
//		printWriter.print("<h1>Today is " + new Date() + "</h1>");
//	}

	// Servlet Life cycle
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<h1>Hello World From doGet Http Servlet!</h1>");
		printWriter.print("<h1>Today is " + new Date() + "</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
