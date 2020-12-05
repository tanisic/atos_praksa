package hr.atos.praksa.tinanisic.zadatak15;

public interface IAdmin extends IUser,ISuperuser{
	public void editTask(int taskID);
	public void editEmployee(int employeeID);
	public void removeTask(int taskID);
	public void removeEmployee(int employeeID);
}
