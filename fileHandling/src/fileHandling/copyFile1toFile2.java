package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class copyFile1toFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("file3.txt");
      BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
      String line=br.readLine();
      while(line!=null)
      {
    	  pw.print(line);
    	  line=br.readLine();
      }
     
      br=new BufferedReader(new FileReader("file2.txt"));
       line=br.readLine();
      while(line!=null)
      {
    	  pw.print(line);
    	  line=br.readLine();
      }
      
      pw.flush();
      pw.close();
      br.close();
	}

}
