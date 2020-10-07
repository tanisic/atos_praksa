package hr.atos.praksa.tinanisic.zadatak15;
import java.sql.*;

public class SqlDriver {
	
	private Connection connection;
	private String address;
	private String password;
	private String username;
	
	public SqlDriver(String address,String username,String password)
	{
		this.address = address;
		this.username = username;
		this.password = password;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://"+address,username,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Employee> getEmployeeList() {
		
	}
	
	
}
	
	
