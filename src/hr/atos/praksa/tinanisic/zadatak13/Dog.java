package hr.atos.praksa.tinanisic.zadatak13;

public class Dog implements Animal{

	private String name;
	
	public Dog(String name) {
	this.name=name;
	}
	
	@Override
	public void eat() {
		System.out.println(this.name+" eats food.");
		
	}

	@Override
	public void sleep() {
		System.out.println(this.name+" is sleeping.");
		
	}
	
}
