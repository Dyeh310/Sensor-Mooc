package e21.printer;

public class Main {

	public static void main(String[] args) throws Exception {

		Printer p = new Printer ("src/test.txt");
		Analysis a = new Analysis("src/test.txt");
		
		p.printLineWhichContains("am");
		
		System.out.println("There are : " + a.lines() + " lines");
		System.out.println("There are : "  + a.characters() + " characters");
		
		
	}

}
