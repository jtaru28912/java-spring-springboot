package learning_further;

import java.io.FileWriter;
import java.util.Scanner;

public class Taruwritefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fr = new FileWriter("Tarufile.txt");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println("Data inputting: ");
			fr.write(s);
			fr.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
