package hr.atos.praksa.tinanisic.zadatak06;

import java.util.Scanner;

public class TablicaMnozenja {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("-------------------------------");
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		System.out.println("-------------------------------");
		System.out.println(" * |  1  2  3  4  5  6  7  8  9");
		for(int i = 1; i<10;i++){
			System.out.print(" "+i+" |");
			
			for(int j = 1; j<10;j++){
				
				System.out.format("%3d",i*j);
				}
			System.out.println();
		}
		System.out.println("-------------------------------");
		System.out.format(":  :  :  :  :  :  :  : by %31s",name);
		
		
	}

}
