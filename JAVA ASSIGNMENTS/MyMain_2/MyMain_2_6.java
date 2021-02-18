import java.util.*;

class MyMain_2_6 //extends Xlint

{
	public static void main(String args[])
	{
		int i,j;
		String st;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter an integer: ");
		i= s.nextInt();
		System.out.println("Converting an integer to integer object! ");
		Integer in= Integer.valueOf(i);
		System.out.println("Converting an integer object to integer! ");
		j= in.intValue();
		System.out.println("Converting an integer to String! ");
		st=Integer.toString(i);
		System.out.println("Converting an String to integer object! ");
		Integer k= Integer.valueOf(st);
		System.out.println("Value of integers: "+i+", "+j);
		System.out.println("Value of integer objects: "+in.intValue()+", "+k.intValue());
		System.out.print("Value of String: "+st);
	}
}