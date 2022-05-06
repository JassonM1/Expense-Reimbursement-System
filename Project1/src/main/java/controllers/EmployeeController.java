package controllers;

import java.util.List;

import com.service.EmployeeService;
import com.service.EmployeeServicePostgress;

import assignment.EmployeeTable;
import io.javalin.http.Handler;
import project.dao.EmployeeDao;
import project.dao.EmployeePostgressDao;

public class EmployeeController {
static EmployeeDao dao = new EmployeePostgressDao(); 
	
	public static Handler getAllEmployees = ctx-> {
		List<EmployeeTable> eList = dao.getAllEmployees();
		ctx.json(eList);
	};
	public static Handler loginEmployee = ctx-> {
		EmployeeTable test = ctx.bodyAsClass(EmployeeTable.class);
		EmployeeTable login = dao.LoginEmployee(test);
		ctx.json(login);
	};
}
