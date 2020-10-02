package hr.atos.praksa.tinanisic.zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordStatistic {

	private HashMap<String,Integer> wordStatistic;
	private Scanner file;
	private String fileLocation;
	public WordStatistic(String fileLocation) throws FileNotFoundException {
		wordStatistic = new HashMap<String,Integer>();
		file = new Scanner(new File(fileLocation));
		this.fileLocation = fileLocation;
	}
	
	public void readFile() {
		while(file.hasNext()) {
			String word = file.next().toLowerCase();
			if(!isStringOnlyAlphabet(word)) {
				word.replaceAll(".,","");
			}
			if(wordStatistic.containsKey(word)) {
				int wordCount = wordStatistic.get(word) + 1;
				wordStatistic.put(word,wordCount);
			}
			else {
				wordStatistic.put(word,1);
			}
		}
		file.close();
	}
		public static boolean isStringOnlyAlphabet(String word) {
			return((word != null) 
	                && (!word.equals("")) 
	                && (word.matches("^[a-z]*$")));
			
		}
	public void printWordStatistic(String destination) throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter printer = new PrintWriter(destination);
		
		printer.println("U datoteci "+this.fileLocation+" nalaze se eljedece rijeci: ");
		printer.println("------------------------");
		printer.println("Rijec (broj ponavljanja)");
		printer.println("------------------------");
		TreeMap<String,Integer> sortedWordStatistic = new TreeMap<>();
		sortedWordStatistic.putAll(wordStatistic);
		for(Map.Entry<String,Integer> entry : sortedWordStatistic.entrySet()) {
			printer.println(entry.getKey()+" ("+entry.getValue()+")");
		}
		printer.println("------------------------");
		printer.close();
	}
}
