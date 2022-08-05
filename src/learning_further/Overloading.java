package learning_further;

class displayOver{
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c , int  d) {
		System.out.println(c + "," + d);
	}
	public void disp(int num) {
		System.out.println(num);
	}
	protected void disp(char c, float n) {
		System.out.println(c + "," + n);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayOver d = new displayOver();
		d.disp('A');d.disp(30);
		d.disp('B',10);
		d.disp('E',10.00f);


	}

}
