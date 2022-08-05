package java_eight_features;
interface Add{
	public void num();
}
public class LambdaFunction {	
	public static void main(String[] args) {
		//withpout lambda addition implementation using anonymous function
		Add a = new Add() {

			@Override
			public void num() {
				// TODO Auto-generated method stub
				System.out.println("Add");
			}
		};
		a.num();
		
		Add o = ()->{
			System.out.println("Addition by lambda func");
		};
		o.num();
		
	}

}
