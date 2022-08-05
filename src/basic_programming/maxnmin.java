package basic_programming;
import java.math.*;

public class maxnmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,9,6,2,99};
		int x = -2 , y =1000000;
		for (int i = 1 ; i<arr.length; i++) {
			x= Math.max(arr[i-1], arr[i]);
			y = Math.min(arr[i-1], arr[i]);
			
		}
		System.out.println("max is "+ x);
		System.out.println("min is : "+y);

	}

}
