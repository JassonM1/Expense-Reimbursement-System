package assignment;

public class EmployeeTable {
	private int employeeId;
	private String Name;
	private String Title;
	private String Password;
	private String User;
	
	
	public EmployeeTable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeTable(int employeeId, String name, String title, String password, String user) {
		super();
		this.employeeId = employeeId;
		Name = name;
		Title = title;
		Password = password;
		User = user;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getUser() {
		return User;
	}


	public void setUser(String user) {
		User = user;
	}


	@Override
	public String toString() {
		return "EmployeeTable [employeeId=" + employeeId + ", Name=" + Name + ", Title=" + Title + ", Password="
				+ Password + ", User=" + User + "]";
	}



	
	
}

