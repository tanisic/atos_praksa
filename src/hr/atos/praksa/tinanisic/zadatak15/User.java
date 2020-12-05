package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;
import java.util.List;

public class User implements IUser{

	@Override
	public void listTasks() throws SQLException {
		SqlDataManipulator database = new SqlDataManipulator();
		List<Task> taskList = database.getTaskList();
		for(Task task : taskList) {
			System.out.println(task.toString());
		}
	}

	@Override
	public void listEmployees() throws SQLException {
		SqlDataManipulator database = new SqlDataManipulator();
		List<Employee> employeeList = database.getEmployeeList();
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		
	}

}
