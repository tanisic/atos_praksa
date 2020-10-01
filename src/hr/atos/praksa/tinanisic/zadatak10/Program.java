package hr.atos.praksa.tinanisic.zadatak10;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.lang.*;

public class Program {

	
	
	public static void main(String[] args) {
		List<String> txtFiles;
		List<String> csvFiles;	
		List<String> allFiles = new ArrayList<String>();	
		List<String> filesThatContainPhrase = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesi direktorij za pretrazivanje: ");
		String directory = scan.nextLine();
		TextManipulator textManipulator = new TextManipulator(directory);
		System.out.println("Unesi frazu koju zelis pronaci: ");
		String phrase = scan.nextLine();
		txtFiles = textManipulator.extractTxtFiles();
		csvFiles = textManipulator.extractCsvFiles();
				
		allFiles.addAll(txtFiles);
		allFiles.addAll(csvFiles);
		
		for(String file : allFiles) {
			try {
				FileReader fileReader = new FileReader(directory+"\\"+file);
				BufferedReader textReader = new BufferedReader(fileReader);
				String currentLine;
				while((currentLine=textReader.readLine())!=null) {
					if(currentLine.contains(phrase)) {
						filesThatContainPhrase.add(file);
						fileReader.close();
						textReader.close();
						break;
					}
				}
				fileReader.close();
				textReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println("Datoteke koje sadrze frazu su: ");
		for(String file : filesThatContainPhrase) {
			System.out.println(file);
		}
	}

}
