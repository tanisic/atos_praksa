package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws SQLException {
		SqlDriver driver = new SqlDriver("sql7.freemysqlhosting.net:3306/sql7369819","sql7369819","gpZAeltxqv");
		driver.addEmployee(new Employee("Marko","Antic","RI","26621234461"));
		List<Employee> emp = driver.getEmployeeList();
	}

}
