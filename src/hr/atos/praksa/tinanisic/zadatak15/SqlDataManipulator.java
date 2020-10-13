package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SqlDataManipulator implements IDatabaseDataManipulation {

	private SqlDriver driver;
	
	public SqlDataManipulator(SqlLogin sqlLogin) throws SQLException {
		driver = SqlDriver.getInstance(sqlLogin);
	}
	
	public List<Employee> getEmployeeList() throws SQLException {
		Statement statement;
		ResultSet result = null;
			statement = driver.getConnection().createStatement();
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
		statement = driver.getConnection().createStatement();
		String sql = "insert into employee "
		 		+ "(first_name,last_name,workplace,employee_oib)"
		 		+ " values ("+"\'"+employee.getFirstName()+"\',"
		 		+ "\'"+employee.getLastName()+"\',"+"\'"+employee.getWorkplace()+"\',"
		 		+ "\'"+employee.getOib()+"\')";
		statement.executeUpdate(sql);
			
		
	}
	public void addTask(Task task) throws SQLException {
		Statement statement;
		statement = driver.getConnection().createStatement();
		String sql = "insert into task "
		 		+ "(name,description,task_type,status,complexity,spent_hours,"
		 		+ "start_time,end_time)"
		 		+ " values ("+"\'"+task.getTaskName()+"\',"
		 		+ "\'"+task.getDescription()+"\',"+"\'"+task.getTaskType()+"\',"
		 		+ "\'"+task.getCurrentStatus()+"\',\'"+task.getComplexity()+"\',+'"+task.getSpentHours()
		 		+"\',\'"+task.getStartTime()+"\',"+task.getEndTime()+"\')";
		statement.executeUpdate(sql);
		
	}

	@Override
	public List<Task> getTaskList() throws SQLException {
		Statement statement = null;
		ResultSet result = null;
		statement = driver.getConnection().createStatement();
		result = statement.executeQuery("select * from task");
		List<Task> tasks = new ArrayList<Task>();
		while(result.next()) {
			Task temp = new Task("")
		}
	}

	@Override
	public void editTask(int oldId, Task newTask) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editEmployee(int oldId, Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTask(Task task) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	
}
