import java.util.Scanner;

class Student
{
	int roll;
	String name;
	double score;
	
	public Student()  //Constructor 1
	{
		roll=0;
		name="...";
		score=0.0;
	}
	
	public Student(int r)  //Constructor 2
	{
		roll=r;
		name="...";
		score=0.0;
	}
	
	public Student(int r, String n)  //Constructor 3
	{
		roll=r;
		name=n;
		score=0.0;
	}
	
	public Student(int r, String n, double s)  //Constructor 4
	{
		roll=r;
		name=n;
		score=s;
	}
	
	public Student(Student s)  //Constructor 5
	{
		roll=s.roll;
		name=s.name;
		score=s.score;
	}
	
	public void set(int r, String n, double s)
	{
		roll=r;
		name=n;
		score=s;
	}
	
	public void show()
	{
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}

}

class MyMain_1_8
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student details: ");
		System.out.println("Enter roll: ");
		int r=sc.nextInt();
		System.out.println("Enter name: ");
		String n=sc.next();
		System.out.println("Enter score: ");
		double s= sc.nextDouble();
		Student s1= new Student();  //Constructor 1 is called
		Student s2= new Student(r);  //Constructor 2 is called
		Student s3= new Student(r,n);  //Constructor 3 is called
		Student s4= new Student(r,n,s);  //Constructor 4 is called
		Student s5= new Student(s4);  //Constructor 5 is called and deep copy is created
		System.out.println("Student 1: ");
		s1.show();
		System.out.println("Student 2: ");
		s2.show();
		System.out.println("Student 3: ");
		s3.show();
		System.out.println("Student 4: ");
		s4.show();
		System.out.println("Student 5: ");
		s5.show();
		s4.set(r+5, n, s);
		if(s4.roll==s5.roll)
			System.out.println("Copy constructor creates a shallow copy");
		else
			System.out.println("Copy constructor creates a deep copy");
	}
}