package employee.crud.dao;

import java.util.List;

import employee.crud.beans.Employee;

//interface is just providing specification

public interface EmployeeDAO {

	// 1-Insert Employee
	public boolean addEmployee(Employee employee);

	// 2-Update Employee
	public boolean updateEmployee(Employee employee);

	// 3-Delete Employee
	public boolean deleteEmployee(int employeeId);

	// 4-Get All Employee
	public List<Employee> getAllEmployees();

	// 5-Get Employee
	public Employee getEmployee(int employeeId);

}
