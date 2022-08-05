package learning_further;

import java.io.File;

public class TaruFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f = new File("Tarufile.txt");
		boolean val=f.createNewFile();
		if (val)
			System.out.println("The new file is created");
		else 
			System.out.println("Files already exixt");
		System.out.println("File created");
		}
		catch(Exception e) {
			System.out.println("File Exixts");
		}

	}

}
