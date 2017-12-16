package e21.printer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Analysis {
	
	private File file;
	private int characters;
	private Scanner reader;

	public Analysis (String file) throws Exception {
		this.file = new File (file);
		this.reader = new Scanner(this.file, "UTF-8");
		
	}
	
	public int lines() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int lines = 0;
		
		while (reader.readLine() != null) lines++;
		reader.close();
		
		
		return lines;
		
	}
	
	public int characters() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int characters = 0;
		int wordCount = 0;
		
		
		while (reader.readLine() != null) {
			String  currentLine = reader.readLine();
			String[] words = currentLine.split(" ");
			wordCount += wordCount + words.length;
			
			for (String word : words) {
				characters = characters +word.length();
			}
			
		}
		
		
		return characters;
	}

	
}
