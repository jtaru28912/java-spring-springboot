package basic_programming;

class Parentclass{
	Parentclass(){
		System.out.println("Constructor of parent class ..");
	}
	void disp() {
		System.out.println("Parent method");
	}
	void p() {
		System.out.println("Print the method");
	}
}

public class Overriding extends Parentclass {
	Overriding(){
		System.out.println("Constructor of child class..");
	}
	void disp() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		Overriding o = new Overriding();
		//Parentclass c = new Parentclass();
	
		o.disp();
		o.p();
		

	}

}
