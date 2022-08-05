package assignment;
class person{
	String name;
	person(){
		name = "Taru ";
		System.out.println("The name is : "+ name);
	}
}
class emp extends person{
	String empname;
	int JoiningYear;
	double Annualsal;
	String InsuranceNumber;
	
	public emp(String empname, int joiningYear, double annualsal, String insuranceNumber) {
		super();
		this.empname = empname;
		this.JoiningYear = joiningYear;
		this.Annualsal = annualsal;
		this.InsuranceNumber = insuranceNumber;
	}
	
	void disp() {
		System.out.println("Employee name is : "+empname );
		System.out.println("Joining Year is : "+ JoiningYear);
		System.out.println("Annual Salary is : "+ Annualsal);
		System.out.println("National Insurance Number is :"+ InsuranceNumber);
	}
}
public class Employees {

	public static void main(String[] args) {
		
		person p = new person();
		emp e = new emp("Taru" , 2022, 5.5,"B4357y");
		e.disp();
		// TODO Auto-generated method stub

	}

}
