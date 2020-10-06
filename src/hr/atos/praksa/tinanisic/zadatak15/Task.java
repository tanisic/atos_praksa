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
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public taskType getTaskType() {
		return taskType;
	}
	public void setTaskType(taskType taskType) {
		this.taskType = taskType;
	}
	public status getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(status currentStatus) {
		this.currentStatus = currentStatus;
	}
	public int getComplexity() {
		return complexity;
	}
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	public int getSpentHours() {
		return spentHours;
	}
	public void setSpentHours(int spentHours) {
		this.spentHours = spentHours;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
}
