package hr.atos.praksa.tinanisic.zadatak15;
import java.sql.*;
import java.util.*;



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
	
	public List<Employee> getEmployeeList() throws SQLException {
		Statement statement;
		ResultSet result = null;
			statement = connection.createStatement();
			 result= statement.executeQuery("select * from employee");	
		List<Employee> employees = new ArrayList<Employee>();
		while(result.next()) {
			
			Employee temp = new Employee(result.getInt("employee_id"),
					result.getString("first_name"),
					result.getString("last_name"),
					result.getString("workplace"),
					result.getString("employee_oib")
					);
			employees.add(temp);
		}
		return employees;
		
	}
	
	public void addEmployee(Employee employee) throws SQLException {
		Statement statement;
		statement = connection.createStatement();
		String sql = "insert into employee "
		 		+ "(first_name,last_name,workplace,employee_oib)"
		 		+ " values ("+"\'"+employee.getFirstName()+"\',"
		 		+ "\'"+employee.getLastName()+"\',"+"\'"+employee.getWorkplace()+"\',"
		 		+ "\'"+employee.getOib()+"\')";
		statement.executeUpdate(sql);
			
		
	}
	public void addTask(Task task) throws SQLException {
		Statement statement;
		statement = connection.createStatement();
		String sql = "insert into task "
		 		+ "(name,description,task_type,status,complexity,spent_hours,"
		 		+ "start_time,end_time)"
		 		+ " values ("+"\'"+task.getTaskName()+"\',"
		 		+ "\'"+task.getDescription()+"\',"+"\'"+task.getTaskType()+"\',"
		 		+ "\'"+task.getCurrentStatus()+"\',\'"+task.getComplexity()+"\',+'"+task.getSpentHours()
		 		+"\',\'"+task.getStartTime()+"\',"+task.getEndTime()+"\')";
		statement.executeUpdate(sql);
		
	}
	
	
	
}
	
	
