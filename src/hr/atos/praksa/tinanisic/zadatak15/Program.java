package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.SQLException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws SQLException {
		SqlDriver driver = SqlDriver.getInstance(new SqlLogin("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7369819",
				"sql7369819","gpZAeltxqv"));

	}

}
