package com.wayneyong.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDbUtil studentDbUtil;

	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		// create our student DB UTIL... and pass in the connection pool / data source
		try {
			studentDbUtil = new StudentDbUtil(dataSource);

		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");

			// if the command is missing, then default to the listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			// route to the appropriate method
			switch (theCommand) {

			case "LIST":
				listStudents(request, response);
				break;

			case "ADD":
				addStudent(request, response);
				break;

			case "LOAD":
				loadStudent(request, response);
				break;

			case "UPDATE":
				updateStudent(request, response);
				break;

			case "DELETE":
				deleteStudent(request, response);

			default:
				listStudents(request, response);

			}

			// list the students ... in MVC fashion
			listStudents(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
//			e.printStackTrace();
		}

	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student id from form data
		String theStudentId = request.getParameter("studentId");

		// delete student from database
		studentDbUtil.deleteStudent(theStudentId);

		// send the "list student" page
		listStudents(request, response);

	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from from data
		int id = Integer.parseInt(request.getParameter("studentId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		// create a new student object
		Student theStudent = new Student(id, firstName, lastName, email);

		// perform update on database
		studentDbUtil.updateStudent(theStudent);

		// send them back to the "list students" page
		listStudents(request, response);

	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student id from form data
		String theStudentId = request.getParameter("studentId");

		// get student from database (db util)
		Student theStudent = studentDbUtil.getStudent(theStudentId);

		// place student in the request attribute
		request.setAttribute("THE_STUDENT", theStudent);

		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispathcer = request.getRequestDispatcher("/update-student-form.jsp");
		dispathcer.forward(request, response);

	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from form data
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		// create a new student object
		Student theStudent = new Student(firstName, lastName, email);
		// add the student to the database
		studentDbUtil.addStudent(theStudent);

		// send back to main page (the student list)
		listStudents(request, response);

	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get students from DB UTIL
		List<Student> students = studentDbUtil.getStudents();

		// add students to the request
		request.setAttribute("STUDENT_LIST", students);

		// send the JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
	}

}
