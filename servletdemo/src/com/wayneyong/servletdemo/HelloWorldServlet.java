package com.wayneyong.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorldServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Step1: set the content type
		response.setContentType("text/html");

		// Step2: get the print writer
		PrintWriter out = response.getWriter();

		// step3: generate HTML content
		out.println("<html><body>");
		out.println("<h2>Hello World</h2>");
		out.println("<hr>");
		out.println("Time on the server is: " + new java.util.Date());
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
