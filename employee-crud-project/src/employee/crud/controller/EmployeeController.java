package employee.crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee.crud.beans.Employee;
import employee.crud.dao.EmployeeDAO;
import employee.crud.dao.EmployeeDAOImpl;

@WebServlet("/")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDAO employeeDAO = null;

	public EmployeeController() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		employeeDAO = new EmployeeDAOImpl();
	}

	// service methods
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("EmployeeController, doPost method started");

		String action = request.getServletPath();
//		String action = "add";
		System.out.println("doPost, action==>" + action);

		switch (action) {
		case "/add": {
			addNewEmployee(request, response); // receive request from view layer, then write to respond to response
			break;
		}
		case "/update": {
			updateEmployee(request, response); // receive request from view layer, then write to respond to response
			break;
		}
		case "/delete": {
			deleteEmployee(request, response); // receive request from view layer, then write to respond to response
			break;
		}
		case "/list": {
			getAllEmployees(request, response); // receive request from view layer, then write to respond to response
			break;
		}
		case "/get": {
			getEmployee(request, response); // receive request from view layer, then write to respond to response
			break;
		}
		default: {
			getAllEmployees(request, response);
		}
		}
	}

	private void getEmployee(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Start getEmployee"); // entry point

		// parameter readings
		// auto increment id
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("getEmployee, Employee ID==>" + id);

		// communicated with database, and added employee to DAO
		Employee employee = employeeDAO.getEmployee(id);
		System.out.println("getEmployee, result is ==> " + employee);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	private void getAllEmployees(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Start getAllEmployees"); // entry point

		// communicated with database, and added employee to DAO
		List<Employee> employees = employeeDAO.getAllEmployees();
		System.out.println("getAllEmployees, employees size ==> " + employees.size());

		try {
			// dispatcher object for view layer
			RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");
			// set employee object attribute
			request.setAttribute("employee", employees); // webscope request scope, teach how we can process request on
															// more than one component
			dispatcher.forward(request, response);

		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Start deleteEmployee"); // entry point

		// parameter readings
		// auto increment id
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("deleteEmployee, Employee ID==>" + id);

		// communicated with database, and added employee to DAO
		boolean result = employeeDAO.deleteEmployee(id);
		System.out.println("deleteEmployee, result is ==> " + result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Start updateEmployee"); // entry point

		// parameter readings
		// auto increment id
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		// define employee object
		Employee employee = new Employee(id, name, email, phone, address);
		System.out.println("updateEmployee, Employee Details==>" + employee);

		// communicated with database, and added employee to DAO
		boolean result = employeeDAO.updateEmployee(employee);
		System.out.println("updateEmployee, result is ==> " + result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	private void addNewEmployee(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Start addNewEmployee"); // entry point

		// parameter readings
		// auto increment id
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		// define employee object
		Employee employee = new Employee(name, email, phone, address);
		System.out.println("addNewEmployee, Employee Details==>" + employee);

		// communicated with database, and added employee to DAO
		boolean result = employeeDAO.addEmployee(employee);
		System.out.println("addNewEmployee, result is ==> " + result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

}
