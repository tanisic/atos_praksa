package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;

public interface ISuperuser extends IUser{
	public void createEmployee() throws SQLException;
	public void createTask() throws SQLException;
}
