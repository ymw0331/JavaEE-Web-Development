package com.wayneyong.servletdemo.mvctwo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MvcDemoServletTwo")
public class MvcDemoServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MvcDemoServletTwo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// step1: get the student data from helper class (model)
		List<Student> students = StudentDataUtil.getStudents();

		// step2: add students to request object
		request.setAttribute("student_list", students);

		// step3: get request dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_students_two.jsp");

		// step4: now forward to JSP
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
