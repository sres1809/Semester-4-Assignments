import java.util.Scanner;

class MyMain_1_3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter height in cm: ");
		int cm=sc.nextInt();
		double foot=(double)cm/30.5;
		double c=cm%30.5;
		double in=c/2.54;
		System.out.println("Foot: "+foot+" Inches: "+in);
	}
}