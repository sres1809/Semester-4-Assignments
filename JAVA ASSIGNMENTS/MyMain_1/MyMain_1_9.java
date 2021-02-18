import java.util.*;

class BankAcct
{
	int acc_no;
	double balance;
	static double interest;

	public BankAcct(int i, double bal)
	{
		acc_no=i;
		balance=bal;
	}
	
	public static void set_interest(double d)
	{
		interest=d;
	}
	
	public static double get_interest()
	{
		return interest;
	}
	
	public double get_bal()
	{
		return balance;
	}
	
	public int get_acc()
	{
		return acc_no;
	}
}

class MyMain_1_9
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter interest rate: ");
		double rate=sc.nextDouble();
		BankAcct.set_interest(rate);
		BankAcct[] acc= new BankAcct[3];
		int i,n,k;
		double bal;
		for(i=0;i<3;i++)
		{
			System.out.println("Enter account number: ");
			n=sc.nextInt();
			System.out.println("Enter balance: ");
			bal=sc.nextDouble();
			acc[i]=new BankAcct(n,bal);
		}
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println("1.Update interest rate");
			System.out.println("2.Display interest rate");
			System.out.println("3.Display balance");
			System.out.println("4.Calculate interest");
			i=sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("Enter new rate of interest: ");
			rate=sc.nextDouble();
			BankAcct.set_interest(rate);
			break;
			
			case 2: System.out.println("Rate of interest: "+BankAcct.get_interest());
			break;
			
			case 3: System.out.println("Enter account number: ");
			n=sc.nextInt();
			for(k=0;k<3;k++)  
			{
				if(n==acc[k].get_acc())
					break;
			}
			if(k==3)
			{
				System.out.println("Invalid account number!");
				break;
			}
			System.out.println("Balance: "+acc[k].get_bal());
			break;
			
			case 4: System.out.println("Enter account number: ");
			n=sc.nextInt();
			for(k=0;k<3;k++)
			{
				if(n==acc[k].get_acc())
					break;
			}
			if(k==3)
			{
				System.out.println("Invalid account number!");
				break;
			}
			System.out.println("Enter time period: ");
			int t=sc.nextInt();
			double amt=acc[k].get_bal()*BankAcct.get_interest()*t/100;
			System.out.println("Interest amount: "+amt);
			break;
			}
		}while(i<5&&i>0);
	}
}