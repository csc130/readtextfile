import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class FileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = JOptionPane.showInputDialog(null, "Enter file name and path");
		Scanner fileInput =null;
		try {
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.err.print("Cannot open the file!");
			System.exit(0);
		}
		while(fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			System.out.println(line);
		}
	}

}
