import java.util.*;

class MyMain_2_7
{
	public static void main(String args[])
	{
		String s,st="and";
		char p;
		int i,n,count=0,j,k,l,m;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		s= sc.nextLine();
		n= s.length();
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)=='a')
				count++;
		}
		System.out.println("1. Number of occurences of 'a' is "+count);
		
		i=0;
		count=0;
		while(i<n)
		{
			i=s.indexOf(st, i);
			if(i==-1)
				break;
			else
				count++;
			i++;
		}
		System.out.println("2. Number of occurences of 'and' is "+count);
		
		i=0;
		i=s.indexOf("The");
		if(i==0)
			System.out.println("3. The string starts with 'The'");
		else
			System.out.println("3. The string does not start with 'The'");
		
		char[] c= s.toCharArray();
		System.out.println("4. The character array contains "+Arrays.toString(c));
		
		m=0;
		i=0;
		System.out.println("The tokens in the string are:-");
			StringTokenizer t= new StringTokenizer(s," .@");
			while(t.hasMoreTokens())
			{
				System.out.println(t.nextToken());
			}
	}
}
