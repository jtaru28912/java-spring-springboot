package StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.student.manage.StudentDao;
import org.student.manage.Studentmodel;

public class Student {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Welcome to Student Management App");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true) {
		//System.out.println("Welcome! ");
		System.out.println("Press 1 to add new student: ");
		System.out.println("Press 2 to delete students record: ");
		System.out.println("Press 3 to display students details: ");
		System.out.println("Press 4 to exit: ");
		int c = Integer.parseInt(br.readLine());
	//add student	
		if(c == 1) {
				System.out.println("Enter Student name: ");
				String name = br.readLine();
				System.out.println("Enter Student's phone: ");
				String phone= br.readLine();
				System.out.println("Enter Student city: ");
				String city = br.readLine();
				
				//create student object to store student details
				Studentmodel st = new Studentmodel(name,phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student added successfully! ");
				}
				else {
					System.out.println("Something went wrong! ");
				}
				System.out.println(st);
				
			}
		//delete details
		if(c == 2) {
				
			}
		//display details
		if(c == 3) {
				
			}
		//exit
		if(c == 4) {
			break;
		}
		else {
			
		}
	}
	System.out.println("Thankyou for using my Application");
	System.out.println("See you soon... bye!");
}
	
}