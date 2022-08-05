package assignment;
class userdetails{
	int userid;
	String firstname , lastname , city;
	public userdetails(int userid, String firstname, String lastname, String city) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}
	
}
class empdetails{
	int empid ;
	String empfname, emplname , empstate, empcity;
	public empdetails(int empid, String empfname, String emplname, String empstate, String empcity) {
		super();
		this.empid = empid;
		this.empfname = empfname;
		this.emplname = emplname;
		this.empstate = empstate;
		this.empcity = empcity;
	}
	
}
class productdetails{
	int pid, pprice;
	String pname , pdesc;
	public productdetails(int pid, int pprice, String pname, String pdesc) {
		super();
		this.pid = pid;
		this.pprice = pprice;
		this.pname = pname;
		this.pdesc = pdesc;
	}
	
}
class orderdetails{
	int orderid, orderprice;
	String ordername , orderdesc;
	public orderdetails(int orderid, int orderprice, String ordername, String orderdesc) {
		super();
		this.orderid = orderid;
		this.orderprice = orderprice;
		this.ordername = ordername;
		this.orderdesc = orderdesc;
	}
	
}
public class paraC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userdetails u = new userdetails(001, "T","J" , "JBP");

	}

}
