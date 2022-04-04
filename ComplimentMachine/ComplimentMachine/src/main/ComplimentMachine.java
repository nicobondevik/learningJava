package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ComplimentMachine {
	// store compliments
	ArrayList<String> compliments = new ArrayList<String>();
	public ComplimentMachine(String path) {
		try {
			parseCSV(path);
		} catch (FileNotFoundException e) {
			System.out.printf("File not found:%n");
			System.out.println(e);
		}
	}
	
	public void parseCSV(String path) throws FileNotFoundException {
		// Parse a CSV-file and add to ArrayList.
		try (Scanner scanner = new Scanner(new File(path));) {
		    while (scanner.hasNextLine()) {
		        compliments.addAll(getRecordFromLine(scanner.nextLine()));
		    }
		}
	}
	
	public List<String> getRecordFromLine(String line) {
		// Parse a line and add every value to values.
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)){
			rowScanner.useDelimiter(";");
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return values;
	}
	
	public String getCompliment() {
		Random random = new Random();
		int idx = random.nextInt(compliments.size());
		return compliments.get(idx);
	}
}