package collections;

import java.util.ArrayList;

public class ArraylistOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Somemore> al = new ArrayList<>();
		al.add(new Somemore(101, 2027, "XYZ", "Trainee") );
		al.add(new Somemore(102, 1026, "oYZ", "Trainee") );
		al.add(new Somemore(103, 2025, "XYo", "Trainee") );
		al.add(new Somemore(104, 2014, "XYg", "Trainee") );
		al.add(new Somemore(105, 2011, "XYd", "Trainee") );
	
		for(Somemore disp: al) {
			System.out.println(disp);
		}
	}

}
