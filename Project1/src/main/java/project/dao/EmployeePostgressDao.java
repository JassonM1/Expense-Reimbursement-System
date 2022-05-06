package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import assignment.ConnectionClass;
import assignment.EmployeeTable;

public class EmployeePostgressDao implements EmployeeDao {

	public ArrayList<EmployeeTable> getAllEmployees() {
		Connection conn = ConnectionClass.createConnection();
		
		String selectEmployees = "select * from employee";
		ArrayList<EmployeeTable> eList = new ArrayList<EmployeeTable>();
		EmployeeTable em; 
		PreparedStatement Ptsmt;
		try {
			Ptsmt = conn.prepareStatement(selectEmployees);
			ResultSet rs;
			rs = Ptsmt.executeQuery();
				while (rs.next()) {
					int id = rs.getInt("employee_id");
					String name = rs.getString("employee_name");
					String title = rs.getString("employee_title");
					String user = rs.getString("employee_user");
					String password = rs.getString("employee_password");
					
					em = new EmployeeTable (id, name, title, user, password);
					eList.add(em);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return eList;
	}

	public EmployeeTable loginEmployee(EmployeeTable test) {
		boolean returnValue = false; 
		EmployeeTable login = new EmployeeTable(); 
		
		String selectEmployees = "select * from employee";
		try (Connection conn = ConnectionClass.createConnection();){
			PreparedStatement Ptsmt = conn.prepareStatement(selectEmployees);
			ResultSet rs;
			rs = Ptsmt.executeQuery();
			String euser = test.getUser();
			String epassword = test.getPassword();
			
				while (rs.next()) {
					String username = rs.getString("employee_user");
					String password = rs.getString("employee_password"); 
					
					if (euser.equals(username) && epassword.equals(password)) {
						login.setUser(username);
						login.setPassword(password);

						//returnValue = true;
						break; //ends while loop
					}
						
				}
					
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return login;
	};

	@Override
	public EmployeeTable LoginEmployee(EmployeeTable login) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
}

