package learning_further;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteInFile {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String data = s.next();
		//String data = "Hi my name is Taru and i m currently learning java file handeling";
		try {
			FileWriter f = new FileWriter("NewFile.txt");
			
			//write string to the file
			f.write(data);
			System.out.println("Data is written ");
			f.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
