package collections;

public class Somemore {
	//data members 
	private int empid, empdesk;
	private String empname,empdesig;
	
	//parameterized constructor to initialize the data members
	public Somemore(int empid, int empdesk, String empname, String empdesig) {
		super();
		this.empid = empid;
		this.empdesk = empdesk;
		this.empname = empname;
		this.empdesig = empdesig;
	}
	//overriding the method to print 
	@Override
	public String toString() {
		return "Somemore [empid=" + empid + ", empdesk=" + empdesk + ", empname=" + empname + ", empdesig=" + empdesig
				+ "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
