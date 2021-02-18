import java.util.Scanner;

class MyMain_1_4
{
	static double PI= 3.14;
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		double rad= sc.nextInt();
		double area= rad*rad*MyMain_1_4.PI;
		System.out.println("The area of the circle is: "+area);
	}
}