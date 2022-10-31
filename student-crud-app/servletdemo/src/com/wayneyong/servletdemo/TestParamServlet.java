package com.wayneyong.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestParamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// step1: set content type
		response.setContentType("text/html");

		// step2: get printwriter
		PrintWriter out = response.getWriter();

		// step3: read configuration params
		ServletContext context = getServletContext(); // inherit from HttpServlet
		String maxCartSize = context.getInitParameter("max-shopping-cart-size");
		String teamName = context.getInitParameter("project-team-name");

		// step4: generate html content
		out.println("<html><body>");
		out.println("Max cart: " + maxCartSize + "<br/>");
		out.println("Team name: " + teamName);

		// READ PER-SERVLET parameter
		String theGreetingMessage = getInitParameter("greeting");
		String theServiceLevel = getInitParameter("serviceLevel");

		// Step 4: generate HTML content
		out.println("<html><body>");
		out.println("Max cart: " + maxCartSize);
		out.println("<br/><br/>");
		out.println("Team name: " + teamName);
		out.println("<hr>");
		out.println("Per Servlet Params<br/><br/>");
		out.println("greeting: " + theGreetingMessage);
		out.println("<br/><br/>");
		out.println("serviceLevel: " + theServiceLevel);

		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
