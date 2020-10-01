package hr.atos.praksa.tinanisic.zadatak10;

import java.io.*;
import java.util.*;


public class TextManipulator  {

	private File directory;
	
	public TextManipulator(String directory) {
		this.directory = new File(directory);
	}
		
	public List<String> extractTxtFiles(){
		List<String> txtFiles = new ArrayList<String>();
		
		for(File file : directory.listFiles()) {
			
			if(file.getName().endsWith(".txt")) {
				txtFiles.add(file.getName());
			}
		}
		return txtFiles;
	}
	
	public List<String> extractCsvFiles(){
		List<String> csvFiles = new ArrayList<String>();
		
		for(File file : directory.listFiles()) {
			
			if(file.getName().endsWith(".csv")) {
				csvFiles.add(file.getName());
			}
		}
		return csvFiles;
	}
	
}
