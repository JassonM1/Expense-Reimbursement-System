package assignment;

import controllers.EmployeeController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class MainMethod {
public static void main(String[] args) {
	/*
	 * Javalin app = Javalin.create(ctx -> {ctx.addStaticFiles("web",
	 * Location.CLASSPATH);} ).start();
	 */
	
	Javalin app=Javalin.create(ctx->{ctx.addStaticFiles("web", Location.CLASSPATH);}).start();
	
	//Javalin app = Javalin.create().start();
	
	app.get("/employees", EmployeeController.getAllEmployees);
	app.post("/login", EmployeeController.loginEmployee);
	
	
	}
}
