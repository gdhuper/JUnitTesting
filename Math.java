import java.util.ArrayList;

public class Math {
	public static int add(int a, int b)
	{
		return a + b;
		
	}
	
	public static ArrayList initializer(int a)
	{
		ArrayList temp;
		if(a == 0)
		{
			temp = new ArrayList<>();
		}
		else
		{
			temp = null;
		}
		return temp;
	}
	
	public static int loop(int one)
	{
		while(one == 1)
		{
			one = 1;
		}
		return 2;
	}

}
