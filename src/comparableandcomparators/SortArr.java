package comparableandcomparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArr {

	public static void main(String[] args) {
		int [] a = {23, 54 , 11 , 54, 6, 0 , 22};
		Arrays.sort(a);
		System.out.println("Sorted int arr : "+ a);
		System.out.println(Arrays.toString(a));
		
		String names []= {"Chennai","Kplkata","Nagpur","Jabalpur","Jaipur","Dehradun"};
		Arrays.sort(names);
		System.out.println(Arrays.deepToString(names));
		
		List<String> color = new ArrayList<>();
		color.add("orange");
		color.add("brown");
		color.add("black");
		color.add("magenta");
		color.add("dark green");
		Collections.sort(color);
		System.out.println(color);
		
	}

}