import java.util.*;

class MyRunnable1 implements Runnable
{
	MyData md;
	
	MyRunnable1(MyData m)
	{
		md=m;
	}
	
	public void run()
	{
		md.a= md.a- 10;
		System.out.println("The number from MyRunnable1 is: "+md.a);
	}
}

class MyRunnable2 implements Runnable
{
	MyData md;
	
	MyRunnable2(MyData m)
	{
		md=m;
	}
	
	public void run()
	{
		md.a= md.a* 20;
		System.out.println("The number from MyRunnable2 is: "+md.a);
	}
}

class MyData
{
	int a;
	
	MyData(int i)
	{
		a=i;
	}
	
	void display()
	{
		System.out.println("The number from Main is: "+a);
	}
}

class MyMain_4_1
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int i;
		System.out.println("Enter an integer: ");
		i= s.nextInt();
		MyData m= new MyData(i);
		MyRunnable1 mr1= new MyRunnable1(m);
		MyRunnable2 mr2= new MyRunnable2(m);
		Thread t1= new Thread(mr1);
		Thread t2= new Thread(mr2);
		t1.start();
		t2.start();
		m.display();
	}
}