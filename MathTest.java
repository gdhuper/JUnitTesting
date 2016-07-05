import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MathTest {

	@Test
	public void test() {
		int sum = Math.add(23, 34);
		assertEquals(57, sum);
	}
	
	@Test
	public void testInitializer()
	{
		ArrayList b = Math.initializer(0);
		assertNull(b);
	}
	
	@Test (timeout = 1000)
	public void testLoop()
	{
		int three = Math.loop(1);
		assertEquals(1, three);
	}
	


}
