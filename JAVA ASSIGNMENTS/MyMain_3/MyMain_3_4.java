import java.util.*;
import java.io.*;

class MyMain_3_4
{
	public static void main(String args[])
	{
		int i= args.length;
		int j;
		try {
			File f= new File("names.dat");
			FileWriter fw= new FileWriter(f);
			fw.write("List of names:\n");
			for(j=0;j<i;j++)
			{
				fw.write(args[j]);
				fw.write("\n");
			}
			fw.close();
			
			FileReader fr= new FileReader(f);
			System.out.println("Contents of the file:--------------\n");
			int s;
			while((s=fr.read())!=-1)
				System.out.print((char)s);
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}