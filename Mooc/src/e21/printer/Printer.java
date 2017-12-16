package e21.printer;

import java.io.File;
import java.util.Scanner;

public class Printer {
	
	private Scanner reader;
	private File textFile;

	public Printer (String fileName) throws Exception {
		this.textFile = new File (fileName);
		this.reader = new Scanner (this.textFile, "UTF-8");
		
	}
	
	public void printLineWhichContains (String word) {
		if (word == "") {
			System.out.println(this.textFile);
		} else {
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				if(line.contains(word)) {
					System.out.println(line);
				}
			}
		}
	}
	
}
