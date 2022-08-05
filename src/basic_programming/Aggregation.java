//has a relationship
package basic_programming;
import java.util.*;
class Address{//has properties mentioned below
	
	int houseno;
	String areaname;
	String pincode, landmark , city , state;

	

public Address( int houseno, String areaname, String pincode,
		String landmark, String city,
			String state) {
		super();
		this.houseno = houseno;
		this.areaname = areaname;
		this.pincode = pincode;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
	}
}

public class Aggregation {
	int rollno;
	String studentName;
	//has a relationship
	Address studentAddr;
	Aggregation(int roll, String name, Address address){
		this.rollno = roll;
		this.studentName= name;
		this.studentAddr = address;
	}

	public static void main(String[] args) {
		Address a = new Address(606, "Garha Phatak", "482002",
				"opposite to Badi Mahakali mandir","Jabalpur","MP");
		Aggregation o = new Aggregation(171, "TARU JAIN", a);
		System.out.println(o.studentName);
		System.out.println(o.rollno);
		System.out.println(o.studentAddr.houseno);
		System.out.println(o.studentAddr.areaname);
		System.out.println(o.studentAddr.landmark);
		System.out.println(o.studentAddr.city);
		System.out.println(o.studentAddr.state);
		System.out.println(o.studentAddr.pincode);

	}

}
