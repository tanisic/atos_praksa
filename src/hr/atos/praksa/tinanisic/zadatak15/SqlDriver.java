package hr.atos.praksa.tinanisic.zadatak15;
import java.sql.*;
import java.util.*;



public class SqlDriver {
	private static SqlDriver instance;
	private Connection connection;
	private final String address = "jdbc:mysql://localhost:3306/zadatak15";
	private String password="";
	private String username="root";
	
	public static SqlDriver getInstance() throws SQLException {
		if(instance == null) {
			instance =  new SqlDriver();
		}
		return instance;
	}
	
	private SqlDriver() throws SQLException {
		this.connection = DriverManager.getConnection(address,username,password);
	}
	
	public Connection getConnection()
	{
		return this.connection;
	}
	
	
}
	
	
