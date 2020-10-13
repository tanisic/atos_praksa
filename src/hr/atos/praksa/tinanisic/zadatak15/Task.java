package hr.atos.praksa.tinanisic.zadatak15;
import java.time.*;
import java.util.*;

public class Task {
	
	
	private String taskName;
	private String description;
	private taskType taskType;
	private status	currentStatus;
	private int complexity;
	private int spentHours;
	private LocalTime startTime; 
	private LocalTime endTime; 

	
	public Task(String taskName, String description,taskType taskType,
			status currentStatus, int complexity, int spentHours, LocalTime startTime, LocalTime endTime) {
		this.taskName = taskName;
		this.description = description;
		this.taskType = taskType;
		this.currentStatus = currentStatus;
		this.complexity = complexity;
		this.spentHours = spentHours;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public enum taskType{
		BUG,TASK 
	}
	public enum status{
		OPEN,CLOSED,PROCESSING
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
	public String getCurrentStatus() {
		return currentStatus.name();
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
