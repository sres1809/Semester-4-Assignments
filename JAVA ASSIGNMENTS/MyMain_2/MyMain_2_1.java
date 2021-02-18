import java.util.*;

class Customer
{
	int id;
	String name;
	double cur_loan;  //stores the loan given to a customer
	long phone;
	boolean pr;
	
	static double normal_credit;  //credit limit for normal customers
	static double priviledged_credit;  //credit limit for priviledged customers
	
	public static void set_loan(double n, double p)
	{
		normal_credit=n;
		priviledged_credit=p;
	}
	
	public void set_details()  //input customer details
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter customer id: ");
		id=s.nextInt();
		System.out.println("Enter customer name: ");
		name=s.next();
		System.out.println("Enter phone number: ");
		phone=s.nextLong();
		cur_loan=0.0;
		System.out.println("Is the customer priviledged one?(Y/N): ");
		char c=s.next().charAt(0);
		if(c=='Y'||c=='y')
			pr=true;
		else
			pr=false;
	}
	
	public void set_name(String n)  //update name
	{
		name=n;
	}
	
	public void set_phone(long p)  //update phone number
	{
		phone=p;
	}
	
	public void display()  //display customer details
	{
		System.out.println("Customer id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phone);
		System.out.println("Current loan amount: "+cur_loan);
		if(pr==true)
		{
			System.out.println("Credit limit: "+priviledged_credit);
			System.out.println("Max amount loan he/she can seek: "+(Customer.priviledged_credit-this.cur_loan));
		}
		else
		{
			System.out.println("Credit limit: "+normal_credit);
			System.out.println("Max amount loan he/she can seek: "+(Customer.normal_credit-this.cur_loan));
		}
	}
	
	public int get_id()  //return customer id
	{
		return id;
	}
	
	public void apply_loan()  //function to apply for loan and check its validity and allow the loan 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter loan amount: ");
		double i=s.nextDouble();
		if(pr==true)
		{
			if(i+cur_loan>priviledged_credit)
			{
				System.out.println("Credit limit exceeded! Loan application denied!");
				return;
			}
			else
			{
				cur_loan+=i;
				System.out.println("Loan application accepted!");
				return;
			}
		}
		else
		{
			if(i+cur_loan>normal_credit)
			{
				System.out.println("Credit limit exceeded! Loan application denied!");
				return;
			}
			else
			{
				cur_loan+=i;
				System.out.println("Loan application accepted!");
				return;
			}
		}
	}
	
	public void reimburse_loan()  //function to reimburse a loan
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter loan amount reimbursed: ");
		double i=s.nextDouble();
		if(i>cur_loan)
		{
			System.out.println("Reimbursed amount exceeds loan taken. Error!");
		}
		else
		{
			cur_loan-=i;
			System.out.println("Amount successfully reimbursed!");
		}
	}
}

class MyMain_2_1
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter credit limit for normal customers: ");
		double nc= s.nextInt();
		System.out.println("Enter credit limit for priviledged customers: ");
		double pc= s.nextInt();
		Customer.set_loan(nc, pc);
		Customer[] cus= new Customer[3];
		System.out.println("Enter customer details: ");
		int i,j,k;
		for(i=0;i<3;i++)
		{
			cus[i]= new Customer();
			cus[i].set_details();
		}
		do
		{
			System.out.println("1.Update customer name");
			System.out.println("2.Update customer phone number");
			System.out.println("3.Apply for loan");
			System.out.println("4.Reimburse loan");
			System.out.println("5.Display customer details");
			System.out.println("6.Exit");
			i=s.nextInt();
			switch(i)
			{
				case 1: System.out.println("Enter customer id: ");
				k=s.nextInt();
				for(j=0;j<3;j++)
				{
					if(cus[j].get_id()==k)
						break;
				}
				if(j==3)
				{
					 System.out.println("Customer id invalid!!");
					 break;
				}
				System.out.println("Enter new customer name: ");
				String na=s.next();
				cus[j].set_name(na);
				break;
				
				case 2: System.out.println("Enter customer id: ");
				k=s.nextInt();
				for(j=0;j<3;j++)
				{
					if(cus[j].get_id()==k)
						break;
				}
				if(j==3)
				{
					 System.out.println("Customer id invalid!!");
					 break;
				}
				System.out.println("Enter new customer phone number: ");
				long n=s.nextLong();
				cus[j].set_phone(n);
				break;
				
				case 3: System.out.println("Enter customer id: ");
				k=s.nextInt();
				for(j=0;j<3;j++)
				{
					if(cus[j].get_id()==k)
						break;
				}
				if(j==3)
				{
					 System.out.println("Customer id invalid!!");
					 break;
				}	
				cus[j].apply_loan();
				break;
				
				case 4: System.out.println("Enter customer id: ");
				k=s.nextInt();
				for(j=0;j<3;j++)
				{
					if(cus[j].get_id()==k)
						break;
				}
				if(j==3)
				{
					 System.out.println("Customer id invalid!!");
					 break;
				}	
				cus[j].reimburse_loan();
				break;
				
				case 5: System.out.println("Enter customer id: ");
				k=s.nextInt();
				for(j=0;j<3;j++)
				{
					if(cus[j].get_id()==k)
						break;
				}
				if(j==3)
				{
					 System.out.println("Customer id invalid!!");
					 break;
				}	
				cus[j].display();
				break;
			}
		}while(i<6&&i>0);
	}
}