package hr.atos.praksa.tinanisic.zadatak15;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.*;
import java.util.*;

public class Task {
	
	private int taskID;
	private String taskName;
	private String description;
	private taskType taskType;
	private status	currentStatus;
	private int complexity;
	private int spentHours;
	private Timestamp startTime; 
	private Timestamp endTime; 

	
	
	public Task(String taskName, String description,
			Task.taskType taskType, Task.status currentStatus, int complexity,
			int spentHours, Timestamp startTime, Timestamp endTime) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.taskType = taskType;
		this.currentStatus = currentStatus;
		this.complexity = complexity;
		this.spentHours = spentHours;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Task(int taskID,String taskName, String description,
			Task.taskType taskType, Task.status currentStatus, int complexity,
			int spentHours, Timestamp startTime, Timestamp endTime) {
		super();
		this.taskID = taskID;
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
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public int getTaskID() {
		return taskID;
	}
	@Override
	public String toString() {
		return "taskID=" + taskID + ",\ntaskName=" + taskName + ",\ndescription=" + description + ",\ntaskType="
				+ taskType + ",\ncurrentStatus=" + currentStatus + ",\ncomplexity=" + complexity + ",\nspentHours="
				+ spentHours + ",\nstartTime=" + startTime + ",\nendTime=" + endTime;
	}
	
}
