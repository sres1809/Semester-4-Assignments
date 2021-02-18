import java.util.*;
import java.lang.*;
import java.io.*;

class String1 {
	public static void main (String[] args) {
	    int t;
		String str;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0)
		{
		str=sc.next();
		String[] s= new String[str.length()];
		int i=0,k;
		StringTokenizer st= new StringTokenizer(str,"."); 
		while(st.hasMoreTokens())
		{
		    s[i]=st.nextToken();
		    i++;
		}
		i--;
		for(k=i;k>0;k--)
		System.out.println(s[k]+".");
		System.out.println(s[k]);
		t--;
		}
	}
}