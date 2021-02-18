import java.util.*;

class Student
{
	int roll;
	String name;
	int score;
	
	void input()
	{
		int i,j=1;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter roll: ");
		roll= s.nextInt();
		System.out.print("Enter name: ");
		name= s.next();
		do
		{
		System.out.print("Enter marks: ");
		i= s.nextInt();
		j=this.set_score(i);
		}while(j>0);
	}
	
	int set_score(int i)
	{
		try
		{
			if(i<0)
			{
				MyException e= new MyException("Score cannot be negative!!!");
				throw e;
			}
				
			else if(i>100)
		    {
		    	MyException e= new MyException("Score cannot be greater than 100!!!");
		    	throw e;
		    }
			else
			{
				score=i;
				return 0;
			}
		}
		
		catch(MyException e)
		{
			System.out.println("Caught an exception");
			System.out.println(e.getMessage());
			return 1;
		}
		
	}
	
	void display()
	{
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
	
}

class MyMain_2_5
{
	public static void main(String args[])
	{
		Student s= new Student();
		int i;
		for(i=0;i<3;i++)
		{
			System.out.println("Enter student details:-");
			s.input();
			s.display();
		}			
	}
}

class MyException extends Exception
{
	MyException(String m)
	{
		super(m);
	}
}