package assignment;

import java.util.Scanner;

public class AverageOf {
	public double computeAvg(int a , int b , int c) {
		double sum = (a+b+c);
		double avg = sum/3;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the three numbers whose average is to be calculated: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		AverageOf x = new AverageOf();
		System.out.println("The Average is : "+ x.computeAvg(a, b, c));

	}

}
