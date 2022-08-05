package learning_further;

import java.util.Scanner;

//interface looks like a class but it is not a class
//An interface can have methods and variables ust like the class 
//but methods declared in an interface by default abstract (no method body)
//Also the variable declared in an interface are public static and final
//Usage of interfaces to obtain full abstraction since the methods do not have a body--function invoke

interface Myinterface{
	public void displayinfo(int n) ;
	public void displayOne(String name);
	public void displayTwo(double num);
	public void displayThree(char d);
	public void displayinfoFour(long age);
}
class Demo implements Myinterface{

	@Override
	public void displayinfo(int n) {
		if(n%2==0)
			System.out.println("Even number..");
		else
			System.out.println("Odd number..");
				
	}

	@Override
	public void displayOne(String name) {
		System.out.println("Hello people!! My name is "+ name);
				
	}

	@Override
	public void displayTwo(double num) {
		if(num/3 > 0)
			System.out.println(num + " Digit is the decimal value");
				
	}

	@Override
	public void displayThree(char d) {
				System.out.println(d + " Most beautiful letter");
	}

	@Override
	public void displayinfoFour(long age) {
		// TODO Auto-generated method stub
		if(age>18)
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
		
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinterface m = new Demo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the details: ");
		int n = s.nextInt();
		
		String name = s.next();
		char d = s.next().charAt(0);
		int age = s.nextInt();
		m.displayinfo(n);
		m.displayinfoFour(age);
		m.displayOne(name);
		m.displayThree(d);
		m.displayTwo(78.000);

	}

}
