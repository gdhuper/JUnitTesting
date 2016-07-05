
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase; //Fixtures


public class JUnitDemo{
	protected int value1, value2;
	
	//assigning the value
	protected void setUp() //Fixture demo
	{
		value1 = 3; 
		value2 = 3;
	}
	
	@Test
	public void testAdd()
	{
		//String str = "Junit is working fine";
		//assertEquals("Junit is working fine", str);
		double sum = value1+value2;
		assertTrue(sum == 6);
	}
	


}
