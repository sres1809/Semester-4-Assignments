import java.util.*;

class Instructor
{
	String name;
	long phone;
	
	public void set_details()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name:");
		name=s.next();
		System.out.println("Enter phone number:");
		phone=s.nextLong();
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phone);
	}
}

class Textbook
{
	String name;
	String author;
	String publisher;
	
	public void set_details()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name:");
		name=s.next();
		System.out.println("Enter author:");
		author=s.next();
		System.out.println("Enter publisher:");
		publisher=s.next();
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Author: "+author);
		System.out.println("Publisher: "+publisher);
	}
}

class Course
{
	String name;
	String ins;
	String book;
	
	public void set_details()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name:");
		name=s.next();
		System.out.println("Enter Instructor name:");
		ins=s.next();
		System.out.println("Enter Textbook name:");
		book=s.next();
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Instructor name: "+ins);
		System.out.println("Textbook: "+book);
	}
}

class MyMain_1_11
{
	public static void main(String args[])
	{
		Instructor[] instr= new Instructor[3];
		Textbook[] tbk= new Textbook[3];
		Course[] cour= new Course[3];
		
		int i;
		System.out.println("Enter Instructor details: ");
		for(i=0;i<3;i++)
		{
			instr[i]= new Instructor();
			instr[i].set_details();
		}
		System.out.println("Enter Textbook details: ");
		for(i=0;i<3;i++)
		{
			tbk[i]= new Textbook();
			tbk[i].set_details();
		}
		System.out.println("Enter Course details: ");
		for(i=0;i<3;i++)
		{
			cour[i]= new Course();
			cour[i].set_details();
		}
		
		System.out.println("Instructor details: ");
		for(i=0;i<3;i++)
			instr[i].display();
		System.out.println("Textbook details: ");
		for(i=0;i<3;i++)
			tbk[i].display();
		System.out.println("Course details: ");
		for(i=0;i<3;i++)
			cour[i].display();
	}
}