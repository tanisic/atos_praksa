package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;

public interface IUser {
	
	public void listTasks() throws SQLException;
	public void listEmployees() throws SQLException;

}
