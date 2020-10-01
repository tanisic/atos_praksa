package hr.atos.praksa.tinanisic.zadatak08;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		LeapYearCalendar calendar = new LeapYearCalendar();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesi broj mjeseca: ");
		int month = scan.nextInt();
		
		if(calendar.isValidMonth(month)) {
			calendar.printCalender(month);
			System.out.println("\n"+month+". mjesec ima "+ calendar.getDays(month)+" dan/a");
		}
		else {
			throw new Exception("Unesen je mjesec koji ne postoji!");
		}

	}

}
