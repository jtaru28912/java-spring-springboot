package collections;

public class StudentOne {
	private String sname , scity;
	private int sroll;

	public StudentOne(String sname, String scity, int sroll) {
		super();
		this.sname = sname;
		this.scity = scity;
		this.sroll = sroll;
	}

	@Override
	public String toString() {
		return "StudentOne [sname=" + sname + ", scity=" + scity + ", sroll=" + sroll + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
