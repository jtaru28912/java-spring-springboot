package learning_further;
import java.io.*;
import java.util.Scanner;
public class FileHandeling {

	public static void main(String[] args) {
		
		// f = new File("NewFile.txt");
//		try {
//			boolean val=f.createNewFile();
//			if (val)
//				System.out.println("The new file is created");
//			else 
//				System.out.println("Files already exixt");
//		}
//		catch(Exception e){
//			e.getStackTrace();
//			System.out.println("Exception Handled! File cannot be created");			
//		}
		
		//char[] a = new char[1000];
		try {
			FileReader  f = new FileReader("NewFile.txt");
			Scanner sc = new Scanner(f);
			System.out.println("Enter the data: ");
			while(sc.hasNext()){
				String data = sc.nextLine();
				System.out.println(data);
			}
			f.read();
			sc.close();
			f.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
