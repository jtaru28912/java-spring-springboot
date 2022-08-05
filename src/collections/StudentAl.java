package collections;

import java.util.ArrayList;

public class StudentAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arraylist of type StudentONE CLASS 
		ArrayList <StudentOne> a = new ArrayList<>();
		a.add(new StudentOne("Taru", "jbp", 171) );
		a.add(new StudentOne("Shailaja", "jbp", 149) );
		a.add(new StudentOne("Trusha", "jbp", 173) );
		a.add(new StudentOne("Tanisha", "jbp", 170) );
		
		//calling the obj having the return value from prev program
		for(StudentOne o : a)
		System.out.println(o);
	}

}
