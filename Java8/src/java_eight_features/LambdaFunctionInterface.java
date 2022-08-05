package java_eight_features;

import java.util.ArrayList;
import java.util.List;

interface Single{
	public int increase(int a);
}
interface Stringconcat{
	public String  concat(String a , String b);
}

public class LambdaFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s = (number)->number+5;
		System.out.println("Given numbers is incremented:  "+ s.increase(22));
		Stringconcat c =(Firstname,Lastname)->Firstname+Lastname;
		System.out.println("My name is : "+ c.concat("James", "Gosling"));
		List<String> l = new ArrayList<>();
		l.add("Happy");
		l.add("Birthday");
		l.add("Anniversary");
		l.add("Journey");
		System.out.println("List elements are: ");
		l.forEach((ele)->System.out.println(ele));
	}

}
