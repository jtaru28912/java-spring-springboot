package unitTesting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Testing_imp {
//method
	@Test
	public void add_two_plus_two_four() {
		final int expected = -5;
		final int actual= Math.addExact(2, 2);
		assertEquals(actual,expected);
	}
	public static void main (String[] args) {
		System.out.println("Single unit testing");
	}
}
