package com.applicatioscope;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationScopeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		config.getServletContext();
	}

	public ApplicationScopeServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();

		try {
			/*
			 * Class.forName("com.mysql.jdbc.Driver"); // Step 1 Connection connection =
			 * DriverManager.getConnection(
			 * "jdbc:mysql://localhost:3306/employee_db?characterEncoding=latin1&useConfigs=maxPerformance",
			 * "root", "password"); // Step 2 // jdbc: mysql: //
			 * localhost:3306/hybrisdb?characterEncoding=latin1&useConfigs=maxPerformance
			 * 
			 * printWriter.print("<h2>Employee DB Connection Object : " + connection +
			 * "</h2>");
			 * 
			 * getServletContext().setAttribute("employee-connection-db", connection); //
			 * set value to context level
			 */
		} catch (Exception e) {
			e.printStackTrace();
			printWriter.print("<h2>Exception in opening connection to Employee DB: " + e.getMessage() + "</h2>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
