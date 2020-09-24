package hr.atos.praksa.tinanisic.zadatak08;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		LeapYearCalendar calendar = new LeapYearCalendar();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesi broj mjeseca: ");
		int month = scan.nextInt();
		
		if(calendar.IsValidMonth(month)) {
			calendar.PrintCalender(month);
			System.out.println("\n"+month+". mjesec ima "+ calendar.GetDays(month)+" dan/a");
		}
		else {
			throw new Exception("Unesen je mjesec koji ne postoji!");
		}

	}

}
