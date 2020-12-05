package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;
import java.util.List;

public interface IDatabaseDataManipulation {
	public List<Employee> getEmployeeList()throws SQLException;
	public void addEmployee(Employee employee) throws SQLException;
	public void addTask(Task task)throws SQLException;
	public List<Task> getTaskList()throws SQLException;
	public void editTask(int taskID)throws SQLException;
	public void editEmployee(int oldId,Employee employee)throws SQLException;
	public void removeTask(int taskID)throws SQLException;
	public void removeEmployee(int employeeID)throws SQLException;
}
