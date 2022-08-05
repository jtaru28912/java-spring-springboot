package learning_further;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("Elephant.txt");
			f.delete();
			System.out.println(("File deleted "));
		}
		catch(Exception e) {
			System.out.println("File not present ");
		}
	}

}
