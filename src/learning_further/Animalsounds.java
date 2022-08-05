package learning_further;

//declaring abstract class
abstract class Animals{
	
	//constructor all
	Animals(){
		System.out.println("Sound of animals: ");
	}
	
	// abstract method
	abstract void sound();	
}
class Dog extends Animals{
	
	Dog(){
		System.out.println("What does the dog says ?");
	}

//child dog is inheriting the abstract method sound
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog says Woof...");
	}
	
}

class Lions extends Animals{
	
	Lions(){
		System.out.println("What does the Lion says ?");
	}
	//child Lion is inheriting the abstract method sound
	
	void sound() {
		System.out.println("Lion Roars...");
		
	}
	
}

public class Animalsounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Dog();//abstraction while calling the object
		a.sound();
		Animals b = new Lions();//abstraction while calling the object
		b.sound();

	}

}
