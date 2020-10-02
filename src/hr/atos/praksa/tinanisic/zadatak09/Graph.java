package hr.atos.praksa.tinanisic.zadatak09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Graph {

	private Map<Integer,Integer> salaries;
	private int[] priceTags= {5000,4000,3000,2000,1000,0};
	private Map<Integer,Integer> roundedSalaries;
	
	public Graph() {
		salaries = new HashMap<Integer,Integer>();
		roundedSalaries=new HashMap<Integer,Integer>();
	}
	
	public int roundSalary(int salary) {
		return (int) (Math.ceil(salary/1000.0)*1000);
		
	}
	public void roundSalariesHashMap() {
		for(Map.Entry<Integer,Integer> entry : salaries.entrySet()) {
			roundedSalaries.put(entry.getKey(),roundSalary(entry.getValue()));
		}
	}
	public void inputSalaries() {
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=12;i++) {
			int salary;
			do {
			System.out.println("Unesi plaæu za "+i+". mjesec: ");
			salary = scan.nextInt();
			}while(salary<0||salary>5500);
			salaries.put(i,salary);
			
		}
		scan.close();
	}
	public void displayGraph() {
		int oddIndex=0;
		for(int i=1;i<12;i++) {
			if(i%2!=0) 
			{
				System.out.format("%4dkn - |", priceTags[oddIndex]);
				
				for(int j=1;j<13;j++) {
					if(roundedSalaries.get(j).intValue()==priceTags[oddIndex]) {
						if(j==1) {
						System.out.print(" x");
						}
						else 
							{System.out.print("  x");}
					}
					else {
						if(j==1)
						{System.out.print("  ");}
						
						else System.out.print("   ");	
					}
					
					
				}
				System.out.println();
				oddIndex++;
			}
			else System.out.print("         |\n");
		}
		System.out.println("          -- -- -- -- -- -- -- -- -- -- -- --");
		System.out.println("           1  2  3  4  5  6  7  8  9 10 11 12");
	}
}
	