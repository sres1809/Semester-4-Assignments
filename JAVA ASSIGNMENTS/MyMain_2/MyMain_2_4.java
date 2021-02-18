import java.util.*;

interface inter 
{
	public int check(int i);
	public void update(int i, int j);
}

interface inter1
{
	public int get_id();
	public void add();
}

class Booklist implements inter
{
	Book[] b;
	static int n=1;
	
	Booklist()
	{
		b= new Book[10];
		int i;
		for(i=0;i<10;i++)
		{
			b[i]= new Book();
		}
	}
	
	void add_book()  //add a new book to the list
	{
		if(n==9)
		{
			System.out.println("Array going out of bounds!!");
			return;
		}
		n++;
		b[n].add();
		System.out.println("Book successfully added!!");
	}
	
	void add_copies()  //add copies of a book to the list
	{
		int i,m,j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter book id: ");
		i=s.nextInt();
		for(j=0;j<n;j++)
		{
			if(i==b[j].get_id())
			{
				System.out.print("Enter number of books to add: ");
				m= s.nextInt();
				b[j].set_total(b[j].get_total()+m);
				b[j].set_av(b[j].get_av()+m);
				System.out.print("Copies successfully added!!");
				break;
			}
		}
	}
	
	void display_booklist()  //display the entire booklist
	{
		int i;
		System.out.println("The BOOKLIST:-");
		for(i=0;i<n;i++)
		{
			System.out.print("Book ID: "+(b[i].get_id()));
			System.out.println("    Title: "+(b[i].get_title()));
		}
	}
	
	void display_book_det()  //display details of a particular book
	{
		int i,j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter book id: ");
		i=s.nextInt();
		for(j=0;j<n;j++)
		{
			if(i==b[j].get_id())
			{
				System.out.println("Book details:- ");
				b[j].display_book();
				break;
			}
		}
	}
	
	void search_book()  //search a particular book
	{
		int i,j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter book id: ");
		i=s.nextInt();
		for(j=0;j<n;j++)
		{
			if(i==b[j].get_id())
			{
				System.out.println("Book details:- ");
				b[j].display_book();
				break;
			}
		}
		if(j==n)
			System.out.println("The book-id does not exist!!");
	}
	
	public int check(int i)  //check availability of a particular book
	{
		int j;
		for(j=0;j<n;j++)
		{
			if(i==b[j].get_id())
			{
				if(b[j].get_av()>0)
				{
					return 1;
				}
				System.out.println("Book is not available!!!");
			}
		}
		return 0;
	}
	
	public void update(int i, int k)  //update the number of copies of a book
	{
		int j;
		for(j=0;j<n;j++)
		{
			if(i==b[j].get_id())
			{
				b[j].set_av(b[j].get_av()+k);
				return;
			}
		}
	}
}

class Book implements inter1
{
	int id;
	String title;
	int total;
	int available;
	
	public int get_id()
	{
		return id;
	}
	
	void set_av(int i)
	{
		available= i;
	}
	
	int get_av()
	{
		return available;
	}
	
	void set_total(int i)
	{
		total= i;
	}
	
	int get_total()
	{
		return total;
	}
	
	String get_title()
	{
		return title;
	}
	
	public void add()  //add properties of a book
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Id: ");
		id= s.nextInt();
		System.out.print("Enter Title: ");
		title= s.next();
		System.out.print("Enter total number of copies: ");
		total= s.nextInt();
		this.set_av(total);
	}
	
	void display_book()  //display a particular book
	{
		System.out.println("ID: "+id);
		System.out.println("Title: "+title);
		System.out.println("Total Number of copies: "+total);
		System.out.println("Available copies: "+(get_av()));
	}
}

class Memberlist implements inter  //list of all members
{
	Member[] m;
	static int n=1;
	
	public Memberlist()
	{
		m= new Member[10];
		int i;
		for(i=0;i<10;i++)
		{
			m[i]= new Member();
		}
	}
	
	public void add_member()  //add a new member to a list
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
	
	public void search_member()  //search a member in the list
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
	
	public void display_memberlist()  //display the memberlist
	{
		int i;
		System.out.println("The MEMBERLIST:-");
		for(i=0;i<n;i++)
		{
			System.out.print("Member ID: "+(m[i].get_id()));
			System.out.println("    Name: "+(m[i].get_name()));
		}
	}
	
	public int check(int i)  //check whether we can issue a book to the member
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
	
	public void update(int i, int k)  //update the number of books issued to the member
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

class Member implements inter1  //class containing details of each member
{
	int id;
	String name;
	String dob;
	int issued;
	
	void set_issued(int i)
	{
		issued=i;
	}
	
	public int get_id()
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
	
	public void add()  //input details of each member
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
	
	void display()  //display member details
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Date of birth: "+dob);
		System.out.println("Books issued: "+(get_issued()));
	}
	
	
}

class Transactionlist  //class containing list of transactions
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
		System.out.println("Book issued sucessfully!! ");
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
				{
					System.out.println("Book returned sucessfully!! ");
					t[k].set_bid(0);
					t[k].set_mid(0);
					return 1;
				}
					
			}
		}
		System.out.println("Entry does not exist!!!");
		return 0;
	}
}

class Transaction  //details of each transaction
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

public class MyMain_2_4
{
	public static void main(String args[])
	{
		int i=1,j,k,flag=0;
		Memberlist ml= new Memberlist();
		Transactionlist tl= new Transactionlist();
		Booklist bl= new Booklist();
		Scanner s= new Scanner(System.in);
		while(i>0)
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. Add a book");
			System.out.println("2. Add copies of a book");
			System.out.println("3. View book details");
			System.out.println("4. View booklist");
			System.out.println("5. Search a book");
			System.out.println("6. Add a member");
			System.out.println("7. Search a member");
			System.out.println("8. View member details");
			System.out.println("9. View memberlist");
			System.out.println("10. Issue book");
			System.out.println("11. Return book");
			System.out.println("0. Exit");
			i=s.nextInt();
			
			switch(i)
			{
			case 0: break;
			
			case 1: bl.add_book();
			        break;
				
			case 2: bl.add_copies();
			        break;
				
			case 3: bl.display_book_det();
			        break;
				
			case 4: bl.display_booklist();
			        break;
				
			case 5: bl.search_book();
			        break;
			
			case 6: ml.add_member();
			        break;
				
			case 7: ml.search_member();
			        break;
				
			case 8: ml.search_member();
			        break;
				
			case 9: ml.display_memberlist();
			        break;
				
			case 10: System.out.print("Enter book ID: ");
			         k= s.nextInt();
			         flag=bl.check(k);
			        		 if(flag==0)
			        		 {
			        			 System.out.println("Book id is not found!!!");
			        			 break;
			        		 }
			         System.out.print("Enter member ID: ");
			         j= s.nextInt();
			         flag=ml.check(j);
			        		 if(flag==0)
			        		 {
			        			 System.out.println("Member id is not found!!!");
			        			 break;
			        		 }
			         flag=tl.issue_book(k,j);
			         if(flag==0)
			        	 break;
			         bl.update(k,1);
			         ml.update(j,1);
			         break;
				
			case 11: System.out.print("Enter book ID: ");
	                 k= s.nextInt();
	                 System.out.print("Enter member ID: ");
			         j= s.nextInt();
			         flag= tl.return_book(k,j);
			         if(flag==0)
			        	 break;
			         bl.update(k,-1);
			         ml.update(j,-1);
			         break;
				
		    default: System.out.println("Invalid choice!!!");
		             break;
			}
		}
	}
}
