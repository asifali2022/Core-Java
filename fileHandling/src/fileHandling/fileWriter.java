package fileHandling;
import java.io.*;


public class fileWriter {

	public static void main(String[] args) throws IOException
	{
	
		File f1=new File("cad.txt");
		FileWriter fw=new FileWriter(f1,true);
		fw.write(78);
		fw.write("hello\nok");
		fw.write("\n");
		char ch []= {'a','s','f','e'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("open file to see output");
		
	}

}
