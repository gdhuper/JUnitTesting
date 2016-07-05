
public class MessageUtil {
	
	private String message;
	
	public MessageUtil(String msg){
		this.message = msg;
		
	}
	
	//prints the message 
	public void printMessage()
	{
		System.out.println(this.message);
		int a = 0;
		int b = 1/a;
		
		
	}
	
	//add Hi to the message
	public String salutationMessage()
	{
		this.message = "Hi!" + this.message;
		System.out.println(this.message);
		return message;
	}
}
