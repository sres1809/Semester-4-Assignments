package memberpackage;
import java.util.*;

public class Memberlist  //class containing list of all members
{
	Member[] m;
	static int n=0;
	
	public Memberlist()
	{
		m= new Member[10];
		int i;
		for(i=0;i<10;i++)
		{
			m[i]= new Member();
		}
	}
	
	public void add_member()  //add a new member
	{
		if(n==9)
		{
			System.out.println("Array going out of bounds!!");
			return;
		}
		n++;
		m[n].add();
		System.out.println("Member successfully added!!");
	}
	
	public void search_member()  //search for a member
	{
		int j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter member Id: ");
		j= s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(j==m[i].get_id())
			{
				System.out.println("Book details:- ");
				m[i].display();
				break;
			}
		}
		if(j==n)
	    System.out.println("The book-id does not exist!!");
	}
	
	public void display_memberlist()  //display memberlist
	{
		int i;
		System.out.println("The MEMBERLIST:-");
		for(i=0;i<n;i++)
		{
			System.out.print("Member ID: "+(m[i].get_id()));
			System.out.println("    Name: "+(m[i].get_name()));
		}
	}
	
	public int check(int i)  //check whether a book can be issued to the member
	{
		int j;
		for(j=0;j<n;j++)
		{
			if(i==m[j].get_id())
			{
				if(m[j].get_issued()<6)
				{
					return 1;
				}
				System.out.println("Maximum number of books issued!!!");
			}
		}
		return 0;
	}
	
	public void update(int i, int k)  //update the number of books issued to a member
	{
		int j;
		for(j=0;j<n;j++)
		{
			if(i==m[j].get_id())
			{
				m[j].set_issued(m[j].get_issued()+k);
				return;
			}
		}
	}
	
}

class Member  //class containing details of each member
{
	int id;
	String name;
	String dob;
	int issued;
	
	void set_issued(int i)
	{
		issued=i;
	}
	
	int get_id()
	{
		return id;
	}
	
	int get_issued()
	{
		return issued;
	}
	
	String get_name()
	{
		return name;
	}
	
	void add()  //add a new member
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Id: ");
		id= s.nextInt();
		System.out.println("Enter Name: ");
		name= s.next();
		System.out.println("Enter Date of birth: ");
		dob= s.next();
		this.set_issued(0);
	}
	
	void display()  //display properties of each member
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Date of birth: "+dob);
		System.out.println("Books issued: "+(get_issued()));
	}
	
	
}

