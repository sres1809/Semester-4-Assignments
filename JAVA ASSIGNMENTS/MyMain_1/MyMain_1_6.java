import java.util.*;

class MyMain_1_6
{
	static void show(int i)
	{
		System.out.println("Inside show function with integer as formal parameter!");
	}
	
	static void show(double d)
	{
		System.out.println("Inside show function with double as formal parameter!");
	}
	
	public static void main(String args[])
	{
		short s=5;
		show(s);  //when either funtion show(int) or show(double), the function is called
		double d= 5.56;
		show(d);  //when only funtion show(int) is present, error message is shown
	}
}