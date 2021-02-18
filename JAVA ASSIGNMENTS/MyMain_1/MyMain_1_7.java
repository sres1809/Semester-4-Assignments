import java.util.Scanner;

class Student
{
	int roll;
	String name;
	double score;
	
	public void set(int r, String n, double s)
	{
		roll=r;
		name=n;
		score=s;
	}
	
	public void display()
	{
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
	
	public void copy(Student s)
	{
		roll= s.roll;
		name= s.name;
		score= s.score;
	}
}

class MyMain_1_7
{
	public static void main(String args[])
	{
		Student stu1= new Student();
		Student stu2= new Student();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student details: ");
		System.out.println("Enter roll: ");
		int r=sc.nextInt();
		System.out.println("Enter name: ");
		String n=sc.next();
		System.out.println("Enter score: ");
		double s= sc.nextDouble();
		stu1.set(r, n, s);
		stu1.display();
		stu2.copy(stu1);
		System.out.println("Details of the copied student: ");
		stu2.display();
	}
}