package stack;

import java.util.Vector;

public class Vector_imp {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		1st Vector v = new Vector();
//		2nd Vector v = new Vector(5);
//		3rd Vector v = new Vector(initial cap , increament cap);
//		example Vector v = new Vector(int initial = 16, cap increamemt = 6);

		Vector<String> v = new Vector(3);
		v.addElement("Bella chao");
		v.addElement("Running up that hill");
		v.addElement("Hold on ");
		v.addElement("Its too Late to apologize");
		v.addElement("Wildest dream");
		v.addElement("Girls Like you");
		v.addElement("What does the fox says");


		System.out.println(v);
		System.out.println(v.capacity());
		
		
	}

}
