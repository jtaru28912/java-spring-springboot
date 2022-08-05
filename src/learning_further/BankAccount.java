package learning_further;


abstract class Bank{
	Bank(){
		System.out.println("Welcome to our Bank.... ");
	}
	abstract void balance();
	abstract void types();//types of account
}
class current extends Bank{

	@Override
	void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void types() {
		// TODO Auto-generated method stub
		System.out.println("you hav a current account");
	}
	
}

class Savings extends Bank{

	@Override
	void types() {
		// TODO Auto-generated method stub
		System.out.println("you have a savings account..");
		
	}
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Current balance in your Savings account is : 50000 Rs.");
	}

	
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank n = new Savings();
		n.types();
		n.balance();
		Bank b = new current();
		b.types();

	}

}
