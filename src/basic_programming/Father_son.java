package basic_programming;
class Father{
	Father(){
		System.out.println("father's property");
		System.out.println("condition is to - Marry ");
	}
	void dispRuleToInherit() {
		System.out.println("Rule must be fulfilled ");
	}
}

public class Father_son extends Father {
	Father_son(){
		System.out.println("Father died..");
	}
	void dispRuleToInherit() {
		System.out.println("not married- rule not fulfilled");
	}

	public static void main(String[] args) {
		Father_son n = new Father_son();
		n.dispRuleToInherit();

	}

}
