package comparableandcomparators;

class Aurthor implements Comparable<Aurthor>{

	String fname , lname , bname;
	@Override
	public int compareTo(Aurthor o) {
		int last = this.lname.compareTo(o.lname);
		return last == 0? this.fname.compareTo(o.fname):last;
	}
	Aurthor (String fname , String lname , String bname){
		this.fname = fname;
		this.lname = lname;
		this.bname = bname;
	}
	
}
public class customObj {

	
}
