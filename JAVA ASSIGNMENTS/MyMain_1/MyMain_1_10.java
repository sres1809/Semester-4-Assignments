import java.util.*;

class Metric
{
	static public double km_mile(double km)
	{
		return km/1.5;
	}
	
	static public double mile_km(double mile)
	{
		return mile*1.5;
	}
}

class MyMain_1_10
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter distance in km: ");
		double km= sc.nextDouble();
		System.out.println("Distance in miles: "+Metric.km_mile(km));
		System.out.println("Enter distance in miles: ");
		double m= sc.nextDouble();
		System.out.println("Distance in km: "+Metric.mile_km(m));
	}
}