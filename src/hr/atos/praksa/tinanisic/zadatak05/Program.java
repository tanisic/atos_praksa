package hr.atos.praksa.tinanisic.zadatak05;



public class Program {
	//ovdje podesavamo interval
	 static int lowerBound = 2;
	 static int upperBound = 130;
	
	public static boolean IsValidInterval() {
		
		if(lowerBound >= 10 || upperBound <= 100) {
			return false;
		}
		else return true;
	}
	
	public static void main(String[] args) throws Exception {
		int counter = 0;
		
		if(IsValidInterval()){
			
			for(int i = lowerBound;i<=upperBound;i++) {
				
				if(i <= 18) {
					counter+=4;
					}
				else {
					counter--;
				}
				
				if(i % 20 == 0) {
					continue;
				}
				
				if(i >= 75) {
					System.out.println("Vrijednost brojaca: " + counter);
					break;
				}
			}
		}
		else {
			throw new Exception("Broj se ne nalazi u zadanom intervalu.");
		}

	}

}
