import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
public class TestJunit1 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	//@Ignore
	
    @Test(expected = ArithmeticException.class)
    public void testPrintMessage()
    {
    	System.out.println("Inside testPrintMessage");
        messageUtil.printMessage();
        
    }
}
