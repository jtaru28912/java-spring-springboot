package learning_further;

import java.io.FileReader;

public class Tarufileread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			char [] a= new char[1000];
			FileReader fr = new FileReader("Tarufile.txt");
			fr.read(a);
			System.out.println("Data read "+a.toString());
			fr.close();
		}
	
		
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
