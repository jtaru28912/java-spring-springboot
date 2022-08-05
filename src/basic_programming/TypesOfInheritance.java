package basic_programming;
import java.util.*;
class Student{
	Scanner s = new Scanner(System.in);
	String name=s.next();
}
class Teacher{
	String designation = "Student";
	String collegeName = "GGITS";
	
	void does() {
		System.out.println("Studying..");
	}
}

public class TypesOfInheritance extends Teacher {
	String branch = "Computer Science ";
	String designation = "passout";

	public static void main(String[] args) {

		TypesOfInheritance instance = new TypesOfInheritance();
		Teacher o = new Teacher();
		System.out.println(instance.designation);
		System.out.println(instance.collegeName);
		System.out.println(instance.branch);
		System.out.println(o.designation);

	}

}
