package hr.atos.praksa.tinanisic.zadatak15;

public interface IAdmin extends IUser,ISuperuser{
	public void editTask(Task task);
	public void editEmployee(Employee employee);
	public void removeTask(Task task);
	public void removeEmployee(Employee employee);
}
