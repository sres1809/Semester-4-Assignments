import java.util.Scanner;

class MyMain_1_1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 short integers: ");
		short num1= sc.nextShort();
		short num2= sc.nextShort();
		int sum= num1+num2;
		System.out.println("The sum is "+sum);
	}
}