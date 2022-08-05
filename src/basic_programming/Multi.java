package basic_programming;

interface Event{
	public void start();
}
interface Sports extends Event{
	public void play();
}
class Cricket implements Sports,Event{
	public void show() {
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}


public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
		

	}

}
