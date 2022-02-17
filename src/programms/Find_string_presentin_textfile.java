package programms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find_string_presentin_textfile {

	public static Boolean checkString() throws FileNotFoundException {
		File file = new File(".//siva.txt");

		Scanner scanner = new Scanner(file);

		// read the file line by line
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains("Sivapavan")) {
				scanner.close();
				return true;
			}
		}
		scanner.close();
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
