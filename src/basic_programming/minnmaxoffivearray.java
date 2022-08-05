package basic_programming;
//Taru Jain
public class minnmaxoffivearray {
	int x = -1;
	int y = 100000;
	void maxnmin(int arr[]) {
		for (int i = 0 ; i<arr.length; i++) {
			if(arr[i]>x) {
				x = arr[i];
			}
			
			if(y>arr[i]) {
				y = arr[i];
			}
			
		}
		System.out.println("Sum of minima is "+ y);
		System.out.println("Sum of maxima is "+ x);
		}
		
	void min(int p[]) {
		for(int i = 0 ; i<p.length; i++) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {2,3,4,5};
		
	    minnmaxoffivearray o = new minnmaxoffivearray();
	    o.maxnmin(a);
	    
	  
	}

}
