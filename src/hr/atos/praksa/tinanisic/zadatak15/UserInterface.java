package hr.atos.praksa.tinanisic.zadatak15;

import java.sql.Timestamp;
import java.util.Scanner;

import hr.atos.praksa.tinanisic.zadatak15.Task.status;
import hr.atos.praksa.tinanisic.zadatak15.Task.taskType;

public class UserInterface {
	
	
	private void printTaskTypes(){
	for(Task.taskType value : Task.taskType.values()) {
		System.out.println(value+") "+value.name());
		}
	}
	private void printStatus() {
		for(Task.status value : Task.status.values()) {
			System.out.println(value+") "+value.name());
		}
	}
	public Task typeTask(){
		System.out.println("DODAVANJE ZADATKA");
		System.out.println("******************************");
		Scanner scan = new Scanner(System.in);
		String taskName;
		String description;
		taskType taskType;
		int tasktype;
		int status;
		status	currentStatus;
		int complexity;
		int spentHours;
		Timestamp startTime; 
		Timestamp endTime;
		System.out.println("Naziv zadatka: ");
		taskName = scan.nextLine();
		System.out.println("Opis zadatka: ");
		description = scan.nextLine();
		System.out.println("Tip zadatka: ");
		do {
			this.printTaskTypes();
			tasktype = scan.nextInt();
			taskType = Task.taskType.values()[tasktype];
		}while(tasktype>1 || tasktype < 0);
		System.out.println("Status zadatka: ");
		do {
			this.printStatus();
			status = scan.nextInt();
			currentStatus = Task.status.values()[status];
		}while(status>2 || status < 0);
		System.out.println("Kompleksnost zadatka: ");
		complexity = scan.nextInt();
		System.out.println("Uloeno vremena na zadatak(sati): ");
		spentHours = scan.nextInt();
		System.out.println("Datum i vrijeme poèetka zadatka (yyyy-mm-dd hh:mm:ss): ");
		String starttime = scan.nextLine();
		startTime = Timestamp.valueOf(starttime);
		System.out.println("Datum i vrijeme rješenja zadatka (yyyy-mm-dd hh:mm:ss): ");
		String endtime = scan.nextLine();
		endTime = Timestamp.valueOf(endtime);
		return new Task(taskName,description,taskType,currentStatus,
				complexity,spentHours,startTime,endTime);
	}
	public Employee typeEmployee() {
		String firstName;
		String lastName;
		String workplace;
		String oib;
		Scanner scan = new Scanner(System.in);
		System.out.println("DODAVANJE KORISNIKA");
		System.out.println("******************************");
		System.out.println("Ime zaposlenika: ");
		firstName = scan.nextLine();
		System.out.println("Prezime zaposlenika: ");
		lastName = scan.nextLine();
		System.out.println("Radno mjesto zaposlenika: ");
		workplace = scan.nextLine();
		System.out.println("OIB zaposlenika: ");
		oib = scan.nextLine();
		return new Employee(firstName,lastName,workplace,oib);
		
	}
}
