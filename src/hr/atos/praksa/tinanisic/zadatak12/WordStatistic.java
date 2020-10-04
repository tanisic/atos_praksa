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
import java.lang.String;
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
			if(word.contains(".")) {
				word=word.substring(0,word.length()-1);
				
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
