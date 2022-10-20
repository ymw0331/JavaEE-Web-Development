package com.servletinitparam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackServlet
 */
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String companyEmailInitParam = null;

	public FeedbackServlet() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		// 1 - read init param
		companyEmailInitParam = config.getInitParameter("company-email"); // when init, it read value form web.xml

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		// 1 - init
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h2> Init Param Value is " + companyEmailInitParam + "</h2>");

		// 2 - read feedback parameter
		String feedbackParam = request.getParameter("feedbackParam");

		// 3 - send an emailf
		printWriter.print("<h3> We will send " + feedbackParam + " to " + companyEmailInitParam + "</h3>");

	}

}
