package fileHandling;
import java.io.*;
public class ReadingArrayOfCharacter {

	public static void main(String[] args)throws IOException 
	{
		File f=new File("cad.txt");
		FileReader fr=new FileReader(f);
	    char ch []=new char[(int)f.length()];
		fr.read(ch);
		for(char data:ch)
		{
			System.out.print(data);
		}
		fr.close();
	}

}
