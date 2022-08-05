package basic_programming;

class BaseClass{
	int n = 10;
	void printnumb() {
		System.out.println("Base class data member : "+ this.n);
	}
	
}
public class SuperKeyword extends BaseClass{
	int n = 20;
	void printnum() {
		System.out.println("Subclass number : "+this.n);
		super.printnumb();
	}

	public static void main(String[] args) {
		SuperKeyword o = new SuperKeyword();	
		o.printnum();

	}

}
