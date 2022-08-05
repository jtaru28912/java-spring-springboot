package java_eight_features;

interface Greetings{
	public String say();
}
@FunctionalInterface
interface MyfunctionalInterface{
	public String sayHello();
}
public class AnotherLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings g = ()->{
			return"Good Afternoon ";
		};
		System.out.println(g.say());
		
		MyfunctionalInterface m = ()->{
			return "Said Hello";
		};
		System.out.println(m.sayHello());
	}

}
