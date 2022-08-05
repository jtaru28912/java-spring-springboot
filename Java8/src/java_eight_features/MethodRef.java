package java_eight_features;
interface Method{
	public void disp();
}
class methodReferance{
	static void printable() {
		System.out.println("Another sytatic ");
	}
}
public class MethodRef {

	static void saySome() {
		System.out.println("Hello ststic!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method o = MethodRef::saySome;
		o.disp();
		Thread  e = new Thread (methodReferance::printable);
		e.start();

	}

}
