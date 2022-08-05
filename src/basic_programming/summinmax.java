package basic_programming;
import java.util.*;
class summinmax {
	 public void getMaxMinValue(int[][] numbers) {
	        int maxValue = -34;
	        for (int j = 0; j < numbers.length; j++) {
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] > maxValue) {
	                    maxValue = numbers[j][i];
	                    maxValue+=maxValue;
	                }
	                
	            }
	        }
	       System.out.println(maxValue);
	        int minValue = 10000000;
	        for (int j = 0; j < numbers.length; j++) {
	        	for (int i = 0; i < numbers[j].length; i++) {
	        		if (numbers[j][] < minValue ) {
	        			minValue = numbers[j][i];
	        			minValue +=minValue;
	        		}
	        	}
	        }
	        System.out.println(minValue);
	        }

	    
	
    public static void main(String[] args) {
        int[][] data = {
                {3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}
        };
        summinmax o = new summinmax();
        o.getMaxMinValue(data);
    }


   
}
