package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import hr.atos.praksa.tinanisic.zadatak15.Task.taskType;
import jdk.jshell.Snippet.Status;

public class SqlDataManipulator implements IDatabaseDataManipulation {

	private SqlDriver driver;
	
	public SqlDataManipulator() throws SQLException {
		driver = SqlDriver.getInstance();
	}
	
	public List<Employee> getEmployeeList() throws SQLException {
		Statement statement;
		ResultSet result = null;
			statement = driver.getConnection().createStatement();
			 result= statement.executeQuery("SELECT * FROM zaposlenici");	
		List<Employee> employees = new ArrayList<Employee>();
		while(result.next()) {
			
			Employee temp = new Employee(
					result.getString("ime"),
					result.getString("prezime"),
					result.getString("radno_mjesto"),
					result.getString("oib")
					);
					
			employees.add(temp);
		}
		return employees;
	}
	public void addEmployee(Employee employee) throws SQLException {
		Statement statement;
		statement = driver.getConnection().createStatement();
		String sql = "INSERT INTO zaposlenici "
		 		+ "(ime,prezime,radno_mjesto,oib)"
		 		+ " values ("+"\'"+employee.getFirstName()+"\',"
		 		+ "\'"+employee.getLastName()+"\',"+"\'"+employee.getWorkplace()+"\',"
		 		+ "\'"+employee.getOib()+"\')";
		statement.executeUpdate(sql);
			
		
	}
	public void addTask(Task task) throws SQLException {
		Statement statement;
		statement = driver.getConnection().createStatement();
		String sql = "INSERT INTO zadaci"
		 		+ "(ime,opis,tip,status,trenutni_status,kompleksnost,potroseno_vrijeme,"
		 		+ "pocetni_datum,zavrsni_datum)"
		 		+ " VALUES ("+"\'"+task.getTaskName()+"\',"
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
		result = statement.executeQuery("select * from zadaci");
		List<Task> tasks = new ArrayList<Task>();
		while(result.next()) {
			Task temp = new Task(result.getInt("zadatak_id"),
					result.getString("naziv"),
					result.getString("opis"),
					Task.taskType.values()[result.getInt("tip")],
					Task.status.values()[result.getInt("trenutni_status")],
					result.getInt("kompleksnost"),
					result.getInt("potroseno_vrijeme"),
					result.getTimestamp("pocetni_datum"),
					result.getTimestamp("zavrsni_datum")
					);
			tasks.add(temp);
			
		}
		return tasks;
	}

	


	@Override
	public void editTask(int taskID) throws SQLException {
		Statement statement = driver.getConnection().createStatement();
		String query = "SELECT * FROM zadaci WHERE zadatak_id="+taskID;
		ResultSet result = statement.executeQuery(query);
	}

	@Override
	public void editEmployee(int oldId, Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTask(int taskID) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(int employeeID) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

	
}
