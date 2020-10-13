package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;
import java.util.List;

public interface IDatabaseDataManipulation {
	public List<Employee> getEmployeeList()throws SQLException;
	public void addEmployee(Employee employee) throws SQLException;
	public void addTask(Task task)throws SQLException;
	public List<Task> getTaskList()throws SQLException;
	public void editTask(int oldId,Task newTask)throws SQLException;
	public void editEmployee(int oldId,Employee employee)throws SQLException;
	public void removeTask(Task task)throws SQLException;
	public void removeEmployee(Employee employee)throws SQLException;
}
