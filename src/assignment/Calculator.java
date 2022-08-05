package assignment;

import java.util.Scanner;

public class Calculator {
	public int sum(int a , int b ) {
		return a+b;
	}
	public int substract(int a , int b ) {
		return(a-b);
	}
	public int multiply(int a , int b ) {
		return (a*b);
	}
	public double divide(int a , int b) {
		return a/b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("Enter 2 numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("choose 1 for addition , 2 for sub , 3 for mul 4 for div and 5 for exit");
		int i = s.nextInt();
		while(i != 5 && i!=0){
		switch(i){
		case 1 : System.out.println("the addition of the numbers is : "+ c.sum(a, b));
				 break;
		case 2 : System.out.println("the sub of 3 numbers are "+ c.substract(a,b));
				 break;
		case 3 : System.out.println("The multiplication is : "+ c.multiply(a, b));
				 break;
		case 4 : System.out.println("The division is "+ c.divide(a, b));
		         break;
		default: System.out.println("Did not select anything");
				
		}
		i--;
		}
	}

}
