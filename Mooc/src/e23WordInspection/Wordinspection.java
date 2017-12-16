package e23WordInspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordinspection {

	private File file;
	private Scanner reader;
	
	public Wordinspection (String file) throws FileNotFoundException {
		this.file = new File(file);
		this.reader = new Scanner(this.file, "UTF-8");
		
	}
	
	
	
	
	
	
	
}
