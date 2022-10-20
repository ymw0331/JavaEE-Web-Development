package com.wayneyong.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig config = null;

	// 1-
	@Override
	public void init(ServletConfig config) throws ServletException {
		// configuration from web.xml
		// TODO Auto-generated method stub
		this.config = config;

	}

	// 2-
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<h1>Hello World</h1>");
		printWriter.print("<h1>Today is " + new Date() + "</h1>");
	}

	// 3-
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	// 4-
	// Helper class function
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	// 5-
	// Helper class function
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}