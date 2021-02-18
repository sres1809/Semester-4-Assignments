import java.util.*;
import java.io.*;

class Student implements Serializable 
{
	String name;
	int roll;
	int score;
	
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.println("Roll: ");
		roll=s.nextInt();
		System.out.println("Name: ");
		name=s.next();
		System.out.println("Score: ");
		score=s.nextInt();
	}
	
	void display()
	{
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
}

class MyMain_3_5
{
	public static void main(String args[])
	{
		int j;
		Student[] st= new Student[3];
		try {
			File f= new File("student.dat");
			FileOutputStream fos= new FileOutputStream(f);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			for(j=0;j<3;j++)
			{
				st[j]= new Student();
				st[j].input();
				oos.writeObject(st[j]);
			}
			oos.close();
			fos.close();
			
			System.out.println("The contents of the file is:----");
			FileInputStream fis= new FileInputStream(f);
			ObjectInputStream ois= new ObjectInputStream(fis);
			for(j=0;j<3;j++)
			{
				Student s= new Student();
			    s= (Student)ois.readObject();
				s.display();
			}
			ois.close();
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
	    }
    }
}