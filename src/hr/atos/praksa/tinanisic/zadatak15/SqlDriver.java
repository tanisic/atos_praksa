package hr.atos.praksa.tinanisic.zadatak15;
import java.sql.*;
import java.util.*;



public class SqlDriver {
	private static SqlDriver instance;
	private Connection connection;
	private String address;
	private String password;
	private String username;
	
	public static SqlDriver getInstance(SqlLogin sqlLogin) throws SQLException {
		if(instance == null) {
			instance =  new SqlDriver(sqlLogin);
		}
		return instance;
	}
	
	private SqlDriver(SqlLogin sqlData) throws SQLException {
		this.address = sqlData.getHostname();
		this.password = sqlData.getPassword();
		this.username = sqlData.getUsername();
		this.connection = DriverManager.getConnection(address,username,password);
	}
	
	public Connection getConnection()
	{
		return this.connection;
	}
	
	
}
	
	
