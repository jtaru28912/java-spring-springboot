package learning_further;

abstract class Animal{
	void disp(int a) {
		//normal method
	}
	
	protected abstract void disp();
	String animal = "Lion";
}
class Lion extends Animal{
	
	public void disp() {
		System.out.println("King of the Forest ");		
	}
	
}

public class Abstractclass {
	
	public static void main(String args[]) {
//		Abstract class implementation happens on inheritance concept onlyt
//		 a class that is declared using abstract keyword is abstract class and it can have abstract method and concrete method
//		 regular methods with bodies are known as concrete method
//		 a normal class non abstract class cannot have abstract method
//		an abstract class cannot be instantiated , we cannot create an object of that class
	
	Lion l = new Lion();
	l.disp(5);
		
		Animal o = new Lion();
		o.disp();
		
	}

}
