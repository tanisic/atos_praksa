package hr.atos.praksa.tinanisic.zadatak08;

public class LeapYearCalendar {

	private int[] daysInMonth = {31,29,31,30,31,30,
								31,31,30,31,30,31};
	
	public boolean IsValidMonth(int month)
	{
		if(month>12 || month <1) return false;
		else return true;
	}
	
	public int GetDays(int month) {
		return daysInMonth[month-1];
	}
	public void PrintCalender(int month) {
		int days = GetDays(month);
		System.out.println("  P  U  S  È  P  S  N");
			for(int j = 1; j<=days;j++)
			{
				if(j==8 || j==15 || j == 22 || j==29) {
					System.out.format("\n%3d", j);
				}
				else System.out.format("%3d", j);					
			}
		}
	}
	

