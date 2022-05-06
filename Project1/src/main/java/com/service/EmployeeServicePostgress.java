package com.service;

import java.util.ArrayList;

import assignment.EmployeeTable;
import project.dao.EmployeeDao;
import project.dao.EmployeePostgressDao;

public class EmployeeServicePostgress implements EmployeeService{
	static EmployeeDao dao = new EmployeePostgressDao();
	
	@Override
	public ArrayList<EmployeeTable> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.dao.getAllEmployees();
	}

//	@Override
//	public EmployeeTable loginEmployee(EmployeeTable loginCredentials) {
//		// TODO Auto-generated method stub
//		String LoginUser = loginCredentials.getUser();
//		String LoginPassword = loginCredentials.getPassword();
//		return dao.LoginEmployee(LoginUser, LoginPassword);
//	}
//	

}
