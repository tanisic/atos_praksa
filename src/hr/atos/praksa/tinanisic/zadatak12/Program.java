package hr.atos.praksa.tinanisic.zadatak12;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Unesi lokaciju txt datoteke iz koje zelis statistiku rijeci: ");
		String fileLocation = scan.nextLine();
		WordStatistic wordStatistic = new WordStatistic(fileLocation);
		wordStatistic.readFile();
		System.out.println("Unesi destinaciju izlazne datoteke: ");
		String outputFile = scan.nextLine();
		wordStatistic.printWordStatistic(outputFile);
		
	}
		

}
