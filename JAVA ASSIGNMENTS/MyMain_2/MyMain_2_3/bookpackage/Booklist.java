package bookpackage;
import java.util.*;

public class Booklist  //the entire booklist
{
	Book[] b;  //creating an array of books
	static int n=0;
	
	public Booklist()
	{
		b= new Book[10];
		int i;
		for(i=0;i<10;i++)
		{
			b[i]= new Book();
		}
	}
	
	public void add_book()  //add a book to the booklist
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
	
	public void add_copies()  //add copies to an existing book
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
	
	public void display_booklist()  //display the entire booklist
	{
		int i;
		System.out.println("The BOOKLIST:-");
		for(i=0;i<n;i++)
		{
			System.out.print("Book ID: "+(b[i].get_id()));
			System.out.println("    Title: "+(b[i].get_title()));
		}
	}
	
	public void display_book_det()  //display details of a book
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
	
	public void search_book()  //search a book
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
	
	public int check(int i)  //check book availability 
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
	
	public void update(int i, int k)  //update the number of copies available for a particular book
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

class Book  //class containing details about each book
{
	int id;
	String title;
	int total;
	int available;
	
	public int get_id()
	{
		return id;
	}
	
	public void set_av(int i)
	{
		available= i;
	}
	
	public int get_av()
	{
		return available;
	}
	
	public void set_total(int i)
	{
		total= i;
	}
	
	public int get_total()
	{
		return total;
	}
	
	public String get_title()
	{
		return title;
	}
	
	public void add()  //add a book
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Id: ");
		this.id= s.nextInt();
		System.out.print("Enter Title: ");
		this.title= s.next();
		System.out.print("Enter total number of copies: ");
		this.total= s.nextInt();
		this.set_av(total);
	}

	public void display_book()  //display a book
	{
		System.out.println("ID: "+id);
		System.out.println("Title: "+title);
		System.out.println("Total Number of copies: "+total);
		System.out.println("Available copies: "+(get_av()));
	}
}

