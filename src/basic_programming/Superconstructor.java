package basic_programming;
class Super{
	Super(){
		System.out.println("Constructor of parent class ");
	}
}
class Subsuperclass extends Super{
	Subsuperclass(){
		System.out.println("COnstructor of subclass ");
	}
}
public class Superconstructor {
	public static void main(String args[]) {
		Subsuperclass n = new Subsuperclass();
	}

}
