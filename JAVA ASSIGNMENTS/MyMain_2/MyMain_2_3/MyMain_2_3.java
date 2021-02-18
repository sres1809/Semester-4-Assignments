import java.util.*;
import bookpackage.*;
import memberpackage.*;
import transactionpackage.*;

class MyMain_2_3
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