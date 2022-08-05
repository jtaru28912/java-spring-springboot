package assignment;

class Account {
	long accno=123456789 ;
	Account(long accno){
		System.out.println("Your account number is "+ this.accno);
	}
	void currentBalance() {
		System.out.println("The current balance is : 2000000");
	}
	
}
class SavingAccount extends Account{
	SavingAccount(long accno) {
		super(accno);
		// TODO Auto-generated constructor stub
	}
	//super(accno);
	int intrest= 700 ;
	void addIntrest(int intrest) {
		intrest = this.intrest;
		System.out.println("The intrest of value "+ intrest +"is added to the current balance");
	}
	void currentBalance() {
		System.out.println("The current balance is : 2000000: "+ intrest);
	}
	
}
class CurrentAccount extends Account{
	int overdraft_limit=25000;

	CurrentAccount(long accno) {
		super(accno);
		// TODO Auto-generated constructor stub
	}
	void viewOverdraft() {
		System.out.println("Your overdraft limit is : "+ this.overdraft_limit);
	}
	
}
public class Abank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] o = new Account[3];
		
		

	}

}
