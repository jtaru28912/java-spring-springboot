package assignment;

import java.util.Scanner;

public class Absolute {
	public String readFloat(float n) {
		if (n == 0 ) {
			return "ZERO and SMALL";
		}
		if(n <0) {
			if(Math.abs(n)<1) {
				return "NEGATIVE and SMALL";
			}
			return "NEGATIVE and LARGE";
		}
		if(Math.abs(n)<1) {
			return "POSITIVE and SMALL";
		}
			return "POSITIVE and LARGE";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		float n = s.nextFloat();
		Absolute a = new Absolute();
		System.out.println("The number is :"+ a.readFloat(n));

	}

}
