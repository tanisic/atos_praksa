package hr.atos.praksa.tinanisic.zadatak15;

import java.util.*;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String workplace;
	private String oib;
	private int employeeId;
	
	
	public Employee(int id,String firstName, String lastName, String workplace, String oib) {
		this.employeeId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workplace = workplace;
		this.oib = oib;
		
	}
	public Employee(String firstName, String lastName, String workplace, String oib) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.workplace = workplace;
		this.oib = oib;
		
	}
	public int getId() {
		return employeeId;
	}
	public void setId(int id) {
		this.employeeId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	
	
	
}
