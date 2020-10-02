package hr.atos.praksa.tinanisic.zadatak10;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.lang.*;

public class Program {

	
	
	public static void main(String[] args) {
		List<String> allFiles = new ArrayList<String>();	
		List<String> filesThatContainPhrase = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesi direktorij za pretrazivanje: ");
		String directory = scan.nextLine();
		TextManipulator textManipulator = new TextManipulator(directory);
		System.out.println("Unesi frazu koju zelis pronaci u datotekama: ");
		String phrase = scan.nextLine();
					
		allFiles.addAll(textManipulator.extractTxtFiles());
		allFiles.addAll(textManipulator.extractCsvFiles());
		
		for(String file : allFiles) {
			try {
				FileReader fileReader = new FileReader(directory+"\\"+file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String currentLine;
				while((currentLine=bufferedReader.readLine()) != null) {
					if(currentLine.contains(phrase)) {
						filesThatContainPhrase.add(file);
						fileReader.close();
						bufferedReader.close();
						break;
					}
				}
				fileReader.close();
				bufferedReader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}	
			
		}
		
		if(filesThatContainPhrase.isEmpty()) {
			System.out.println("U direktoriju nema datoteke koja sadrzi frazu.");
		}
		else {
		System.out.println("Datoteke koje sadrze frazu su: ");
		for(String file : filesThatContainPhrase) {
			System.out.println(file);
		}
	}
	}

}
