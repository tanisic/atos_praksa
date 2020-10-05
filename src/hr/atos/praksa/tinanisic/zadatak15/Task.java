package hr.atos.praksa.tinanisic.zadatak15;
import java.time.*;

public class Task {
	private String taskName;
	private String description;
	private taskType taskType;
	private status	currentStatus;
	private int complexity;
	private int spentHours;
	private LocalTime startTime; 
	private LocalTime endTime; 
	
	public enum taskType{
		bug,task
	}
	public enum status{
		open,closed,processing
	}
}
