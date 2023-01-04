package fileHandling;
import java.io.*;
public class fileReader {

	public static void main(String[] args) throws IOException
	{
		
		FileReader fr=new FileReader("cad.txt");
		int i=fr.read();//returns unicode of character
		while(i!=-1)
		{
			System.out.println(i);
			i=fr.read();
			
		}
	}

}
