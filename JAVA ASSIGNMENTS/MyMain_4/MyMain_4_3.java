import java.util.*;

class MyData
{
	int a;
	boolean value=false;
	
	MyData(int i)
	{
		a=i;
	}
	
	synchronized void writer(int i)
	{
		//System.out.println("Inside the writer function");
		while(value)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Caught an exception!");
			}
		}
		this.a=i;
		System.out.println("Write: "+this.a);
		value=true;
		notify();
	}
	
	synchronized void reader()
	{
		//System.out.println("Inside the reader function");
		while(!value)
		{
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Caught an exception!");
			}
		}
		System.out.println("Read: "+this.a);
		value=false;
		notify();
	}
}

class MyRunnable1 implements Runnable
{
	MyData md;
	
	MyRunnable1(MyData m)
	{
		this.md=m;
		new Thread(this, "Reader").start();
	}
	
	public void run()
	{
		int i=0;
		while(i<10)
			md.writer(i++);
	}
}

class MyRunnable2 implements Runnable
{
	MyData md;
	
	MyRunnable2(MyData m)
	{
		this.md=m;
		new Thread(this, "Writer").start();
	}
	
	public void run()
	{
		int i=0;
		while(i<10)
		{
			md.reader();
			i++;
		}
			
	}
}

class MyMain_4_3
{
	public static void main(String args[])
	{
		MyData m= new MyData(100);
		new MyRunnable1(m);
		new MyRunnable2(m);
	}
}