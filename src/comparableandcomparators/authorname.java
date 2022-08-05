package comparableandcomparators;

import java.util.ArrayList;
import java.util.Collections;

public class authorname {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Aurthor> al = new ArrayList<>();
		al.add(new Aurthor("Henrey ","Miller","Tropic of Cancer"));
		al.add(new Aurthor("Chetan ","Bhagat","Half Girlfriend"));
		al.add(new Aurthor("Chetan ","Bhagat","2 States"));
		al.add(new Aurthor("Frank ","Miller","300"));
        Collections.sort(al);
        for(Aurthor d : al) {
        	System.out.println(d.fname + " "+ d.lname 
        			+ " wrote the Book: "+ d.bname);
        }
	}
}
