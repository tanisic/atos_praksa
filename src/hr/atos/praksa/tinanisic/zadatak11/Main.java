package hr.atos.praksa.tinanisic.zadatak11;

import java.util.Scanner;

public class Main {

	public static ILanguage chooseLanguage() {
		Scanner scan = new Scanner(System.in);
		int languageNumber;
		do {
			System.out.println("Choose your language: ");
			System.out.println("1) Croatian");
			System.out.println("2) English");
			System.out.println("3) German");		
			languageNumber = scan.nextInt();
		}while(languageNumber>3||languageNumber<1);
		
		switch(languageNumber) {
		case 1: return new Croatian();
		case 2: return new English();
		case 3: return new German();
		default : return null;
		}
			
		
	}
	public static void main(String[] args) {
		
		  ILanguage lang = chooseLanguage();
		  
		  lang.interact();
		 
		
	}

}
