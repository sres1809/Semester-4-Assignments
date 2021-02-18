import java.util.*;

class MyMain_1_2
{
	public static void main(String args[])
	{
		int count=0;
		System.out.println("The input strings are :");
		for(String s: args)
		{
			count++;
			System.out.println(s);
		}
		System.out.println("Number of strings= "+count);
	}
}