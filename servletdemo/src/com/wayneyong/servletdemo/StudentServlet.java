package com.wayneyong.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// step1: set content type
		response.setContentType("text/html");

		// step2: get the printWriter
		PrintWriter out = response.getWriter();

		// step3: generate HTML content

		out.println("<html><body>");
		out.println("The student is confirmed: " + request.getParameter("firstName") + " "
				+ request.getParameter("lastName"));
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
