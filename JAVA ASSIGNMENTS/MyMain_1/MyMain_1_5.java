import java.util.Scanner;

class MyMain_1_5
{
	public static void main(String args[])
	{
		String str1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		str1= sc.next();
		String str2;
		str2= str1;
		if(str1==str2)  //true
			System.out.println("== comparison holds true after assigning one string to another"); 
		else
			System.out.println("== comparison does not hold true after assigning one string to another");
		if(str1.equals(str2))  //true
			System.out.println("equals function return true after assigning one string to another");
		else
			System.out.println("equals function does not return true after assigning one string to another");
		System.out.println("Enter a string 2 times");
		str1=sc.next();
		str2=sc.next();
		if(str1==str2)  //false
			System.out.println("== comparison holds true after taking same input two strings");
		else
			System.out.println("== comparison does not hold true after taking same input two strings");
		if(str1.equals(str2))  //true
			System.out.println("equals function return true after taking same input two strings");
		else
			System.out.println("equals function does not return true after taking same input two strings");
	}
}