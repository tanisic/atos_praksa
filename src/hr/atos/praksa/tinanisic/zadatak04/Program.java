package hr.atos.praksa.tinanisic.zadatak04;

public class Program {
	
public static boolean isEven(int number){
	if(number%2==0) return true;
	else return false;
}
public static void checkMultiples(int number){
	int[] multiples = {3,5,11};
	
	for(int multiple : multiples){
		if(number % multiple == 0) {
			System.out.println(number + " je visekratnik od " + multiple);
		}
	}
	
}

	public static void main(String[] args) {
		int[] array = {2,7,11,15,19};
		
		for(int element : array) {
			if(isEven(element)){
				System.out.println(element + " je paran broj");
				checkMultiples(element);
			}
			else{
				System.out.println(element + " nije paran broj");
				checkMultiples(element);			
			}
			
		}

	}

}
