package basic_programming;
class Car{
	String carname;
	String brand;
	int carid,  carmodel, mfgyear;
	public Car(String carname, String brand, int carid, int carmodel, int mfgyear) {
		this.carname = carname;
		this.brand = brand;
		this.carid = carid;
		this.carmodel = carmodel;
		this.mfgyear = mfgyear;
	}
}
class Buyer extends Car{
	String customerName;
	Buyer(String name, String brand, int carid , int carmodel , 
			int mfgyear, String carname){
		super(carname, brand , carid, carmodel, mfgyear);
		this.customerName=name;
	}
}
public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer o = new Buyer("Taru JAin","Hundai",1234,445,2000,"creta");
		System.out.println(o.carname);
		System.out.println(o.brand);
		System.out.println(o.carid);
		System.out.println(o.carmodel);
		System.out.println(o.customerName);
		System.out.println(o.mfgyear);
		;

	}

}
