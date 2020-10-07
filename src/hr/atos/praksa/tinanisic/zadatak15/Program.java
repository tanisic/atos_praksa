package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws SQLException {
		SqlDriver driver = new SqlDriver("localhost:3306/atos_praksa","root","");
		driver.addEmployee(new Employee("Robin","Raj","OS","16201234461"));
		List<Employee> emp = driver.getEmployeeList();
	}

}
