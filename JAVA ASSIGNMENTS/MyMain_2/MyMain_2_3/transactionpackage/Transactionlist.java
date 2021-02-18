package transactionpackage;
import java.util.*;

public class Transactionlist  //class containing transaction lists
{
	Transaction[] t;
	static int n;
	
	public Transactionlist()
	{
		t= new Transaction[10];
		int i;
		for(i=0;i<10;i++)
		{
			t[i]= new Transaction();
		}
	}
	
	public int issue_book(int i, int j)  //function to issue book
	{
		int k;
		for(k=0;k<n;k++)
		{
			if(t[k].get_mid()==0)
			{
				break;
			}
		}
		if(n==9)
		{
			System.out.println("Array going out of bounds!!");
			return 0;
		}
		k++;
		n++;
		t[k].set_mid(j);
		t[k].set_bid(i);
		return 1;
	}
	
	public int return_book(int i, int j)  //function to return book
	{
		int k;
		for(k=0;k<n;k++)
		{
			if(t[k].get_mid()==j)
			{
				if(t[k].get_bid()==i)
					return 1;
			}
		}
		System.out.println("Entry does not exist!!!");
		return 0;
	}
}

class Transaction  //class containing details of each transaction
{
	int member_id;
	int book_id;
	
	void set_mid(int i)
	{
		member_id=i;
	}
	
	void set_bid(int i)
	{
		book_id=i;
	}
	
	int get_mid()
	{
		return member_id;
	}
	
	int get_bid()
	{
		return book_id;
	}
}

