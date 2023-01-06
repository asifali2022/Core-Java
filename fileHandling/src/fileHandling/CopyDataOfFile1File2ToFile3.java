package fileHandling;

import java.io.*;
public class CopyDataOfFile1File2ToFile3 {

	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("file3.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
	    String line=br.readLine();
	    while(line!=null)
	    {
	    	pw.print(line);
	    	pw.print('\n');
	    	line=br.readLine();
	    }
	   // pw.flush();
	    
	    //
	    br=new BufferedReader(new FileReader("file2.txt"));
	    String line1=br.readLine();
	    while(line1!=null)
	    {
	    	pw.print(line1);
	    	pw.print('\n');
	    	line1=br.readLine();
	    }
	    pw.flush();
	    br.close();
	    pw.close();
	    System.out.println("open file to see output");

	}

}
