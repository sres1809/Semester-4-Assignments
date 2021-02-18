import java.util.*;

class MyMain_2_2
{
	public static void main(String args[])
	{
		int i=1;
		Student st= new Student();
		Faculty f= new Faculty();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Details for student: ");
		st.input_studentdetails();
		System.out.println("Enter Details for faculty: ");
		f.input_facultydetails();
		while(i>0)
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. View Details of student");
			System.out.println("2. View Details of faculty");
			System.out.println("3. Modify student details");
			System.out.println("4. Modify faculty details");
			System.out.println("0. Exit");
			i=s.nextInt();
			switch(i)
			{
			case 0: break;
			
			case 1: st.display_student();
			        break;
			   
			case 2: f.display_faculty();
			        break;
			        
			case 3: st.modify_student();
			        break;
			        
			case 4: f.modify_faculty();
			        break;
			        
			default: System.out.println("Invalid choice!!");
			         break;
			}
		}
	}
}

class Person   //class containing properties common to both students and faculties 
{
	String name;
	Address ad;
	String email;
	int phone;
	
	void input_persondetails()  //input the common properties
	{
		String st;
		int i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name: ");
		st=s.next();
	    this.set_name(st);
	    ad= new Address();
		ad.input_all();
		System.out.print("Enter Email: ");
		st=s.next();
		this.set_email(st);
		System.out.print("Enter Phone Number: ");
		i=s.nextInt();
		this.set_phone(i);
	}
	
	void set_name(String n)  
	{
		name=n;
	}
	
	void set_email(String s)
	{
		email=s;
	}
	
	void set_phone(int i)
	{
		phone=i;
	}
	
	void display_person()  //display the common properties
	{
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone: "+phone);
		ad.display();
	}
}

class Address  //class contains the address properties 
{
	int premise;
	String street;
	String city;
	int pin;
	String state;
	
	void set_premise(int i)
	{
		premise=i;
	}
	
	void set_street(String s)
	{
		street=s;
	}
	
	void set_city(String c)
	{
		city=c;
	}
	
	void set_pin(int i)
	{
		pin=i;
	}
	
	void set_state(String s)
	{
		state=s;
	}
	
	void input_all()  //input all the address properties
	{
		int i;
		String st;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Address Details: ");
		System.out.print("Enter Premise Number: ");
		i=s.nextInt();
		this.set_premise(i);
		System.out.print("Enter Street: ");
		st=s.next();
		this.set_street(st);
		System.out.print("Enter City: ");
		st=s.next();
		this.set_city(st);
		System.out.print("Enter Pin: ");
		i=s.nextInt();
		this.set_pin(i);
		System.out.print("Enter State: ");
		st=s.next();
		this.set_state(st);
	}
	
	void input_select()  //input only one address property
	{
		Scanner s= new Scanner(System.in);
		int i;
		String st;
		System.out.println("Enter your choice: ");
	    System.out.println("1. Modify Premise Number");
	    System.out.println("2. Modify Street");
	    System.out.println("3. Modify City");
	    System.out.println("4. Modify Pin Number");
	    System.out.println("5. Modify State");
	    i=s.nextInt();
	    switch(i)
	    {
	    case 1: System.out.print("Enter Premise Number: ");
		        i=s.nextInt();
		        this.set_premise(i);
		        break;
	    case 2: System.out.print("Enter Street: ");
		        st=s.next();
		        this.set_street(st);
		        break;
	    case 3: System.out.print("Enter City: ");
		        st=s.next();
		        this.set_city(st);
		        break;
	    case 4: System.out.print("Enter Pin: ");
		        i=s.nextInt();
		        this.set_pin(i);
		        break;
	    case 5: System.out.print("Enter State: ");
		        st=s.next();
		        this.set_state(st);
		        break;
		default: System.out.print("Invalid choice!!");
	    }
	}
	
	void display()  //display all address properties
	{
		System.out.println("Premise Number: "+premise);
		System.out.println("Street: "+street);
		System.out.println("City "+city);
		System.out.println("Pin: "+pin);
		System.out.println("State: "+state);
	}
	
}

class Student extends Person  //class contains properties specific to students
{
	int roll;
	String course;
	
	void input_studentdetails()  //input student properties
	{
		int r;
		String st;
		this.input_persondetails();
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Roll: ");
		r=s.nextInt();
		this.set_roll(r);
		System.out.print("Enter Course: ");
		st=s.next();
		this.set_course(st);
	}
	
	void set_roll(int i)
	{
		roll=i;
	}
	
	void set_course(String s)
	{
		course=s;
	}
	
	void display_student()  //display student properties
	{
		this.display_person();
		System.out.println("Roll: "+roll);
		System.out.println("Course: "+course);
	}
	
	void modify_student()  //modify student properties
	{
		int i;
		String st;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. Name");
		System.out.println("2. Email");
		System.out.println("3. Phone Number");
		System.out.println("4. Address");
		System.out.println("5. Roll Number");
		System.out.println("6. Course");
		i=s.nextInt();
		switch(i)
		{
		case 1: System.out.print("Enter Name: ");
		        st=s.next();
	            this.set_name(st);
	            break;
		
		case 2: System.out.print("Enter Email: ");
		        st=s.next();
		        this.set_email(st);
		        break;
		        
		case 3: System.out.print("Enter Phone Number: ");
		        i=s.nextInt();
		        this.set_phone(i);
		        break;
		        
		case 4: ad.input_select();
		        break;
		        
		case 5: System.out.print("Enter Roll: ");
		        i=s.nextInt();
		        this.set_roll(i);
		        break;
		        
		case 6: System.out.print("Enter Course: ");
		        st=s.next();
		        this.set_course(st);
		        break;
		        
	    default: System.out.println("Invalid choice!!");
	             break;
		}
	}
}

class Faculty extends Person  //class contains properties specific to faculties
{
	int id;
	String dept;
	String special;
	
	void input_facultydetails()  //input faculty details
	{
		int r;
		String st;
		this.input_persondetails();
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Id: ");
		r=s.nextInt();
		this.set_id(r);
		System.out.print("Enter Department: ");
		st=s.next();
		this.set_dept(st);
		System.out.print("Enter Specialisation: ");
		st=s.next();
		this.set_dept(st);
	}
	
	void set_id(int i)
	{
		id=i;
	}
	
	void set_dept(String s)
	{
		dept=s;
	}
	
	void set_special(String s)
	{
		special=s;
	}
	
	void display_faculty()  //display faculty details
	{
		this.display_person();
		System.out.println("ID: "+id);
		System.out.println("Department: "+dept);
		System.out.println("Specialisation: "+special);
	}
	
	void modify_faculty()  //modify faculty details
	{
		int i;
		String st;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. Name");
		System.out.println("2. Email");
		System.out.println("3. Phone Number");
		System.out.println("4. Address");
		System.out.println("5. ID");
		System.out.println("6. Department");
		System.out.println("7. Specialisation");
		i=s.nextInt();
		switch(i)
		{
		case 1: System.out.print("Enter Name: ");
		        st=s.next();
	            this.set_name(st);
	            break;
		
		case 2: System.out.print("Enter Email: ");
		        st=s.next();
		        this.set_email(st);
		        break;
		        
		case 3: System.out.print("Enter Phone Number: ");
		        i=s.nextInt();
		        this.set_phone(i);
		        break;
		        
		case 4: ad.input_select();
		        break;
		        
		case 5: System.out.print("Enter Id: ");
		        i=s.nextInt();
		        this.set_id(i);
		        break;
		        
		case 6: System.out.print("Enter Department: ");
		        st=s.next();
		        this.set_dept(st);
		        break;
		        
		case 7: System.out.print("Enter Specialisation: ");
		        st=s.next();
		        this.set_dept(st);
		        break;
		        
	    default: System.out.println("Invalid choice!!");
	             break;
		}
	}
}