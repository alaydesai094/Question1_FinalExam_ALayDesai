import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateFareTest {

	@Test
	public void test() {
		@Test
		public void RC1() {
			//RC1 - Red 
			CalculateFare b = new CalculateFare();
			double fare = b.Total("Don Mills", "Leslie");
			double exp = 2.50;
			assertEquals(fare,exp);
			
			
		}
	}

}
