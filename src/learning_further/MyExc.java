package learning_further;

public class MyExc extends Exception {
String s;
	MyExc(String t){
		s= t;
	}
	public String toString() {
		return ("My Exception occured! "+s);
	}
}
public class Customer{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExc m = new MyExc("Commodities");
		m.toString();
		

	}

}
