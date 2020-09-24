package hr.atos.praksa.tinanisic.zadatak04;

public class Program {
	
public static boolean IsEven(int number){
	if(number%2==0) return true;
	else return false;
}
public static void CheckMultiples(int number){
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
			if(IsEven(element)){
				System.out.println(element + " je paran broj");
				CheckMultiples(element);
			}
			else{
				System.out.println(element + " nije paran broj");
				CheckMultiples(element);			
			}
			
		}

	}

}
