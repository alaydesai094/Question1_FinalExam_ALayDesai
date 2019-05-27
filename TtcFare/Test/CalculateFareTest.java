import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateFareTest {

	@Test
	public void RC1() {
		
		CalculateFare b = new CalculateFare();
		double fare = b.Total("Don Mills", "Leslie");
		assertEquals(2.50, fare);
		
	}

}
