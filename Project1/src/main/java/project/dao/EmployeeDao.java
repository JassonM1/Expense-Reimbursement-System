package project.dao;

import java.util.ArrayList;

import assignment.EmployeeTable;

public interface EmployeeDao {
	 ArrayList<EmployeeTable> getAllEmployees();

	EmployeeTable LoginEmployee(EmployeeTable test);


}
