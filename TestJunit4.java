import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestJunit4 extends TestResult {

	//add the error 
	public synchronized void addError(Test test, Throwable t){
		super.addError((junit.framework.Test) test, t);
	}
	
	//add the failure 
	public synchronized void addFailure(Test test, AssertionFailedError t)
	{
		super.addFailure((junit.framework.Test) test, t);
	}
	 
	
	@Test
	public void testAdd()
	{
		String str = "I am in testAdd method";
		assertEquals("I am in testAdd method", str);
		
	}
	public synchronized int errorCount()
	{
		System.out.println(super.errorCount());
		return super.errorCount();
	}
	
	//Marks that the test run should stop
	public synchronized void stop()
	{
		
	}
}
