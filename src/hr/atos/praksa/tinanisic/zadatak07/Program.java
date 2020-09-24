package hr.atos.praksa.tinanisic.zadatak07;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int lowerBound,upperBound;
		int counter = 0;
		Scanner scan = new Scanner(System.in);
		
		do {System.out.println("Unesite donju granicu intervala: ");
			lowerBound=scan.nextInt();
			System.out.println("Unesite gornju granicu intervala: ");
			upperBound=scan.nextInt();
		}while(lowerBound>=upperBound);
		
		for(int i = lowerBound;i<=upperBound;i++)
		{
			if(i % 6 == 0) counter++;
		}
		System.out.println("U intervalu ["+lowerBound+","+upperBound+"] nalazi se "
		+ counter + " brojeva djeljivih sa 6");
	}

}
