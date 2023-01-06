package fileHandling;

import java.io.*;
public class Bufferedwriter {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("cad.txt",true);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.newLine();
		bf.write(100);
		bf.newLine();
		bf.write('s');
		char [] ch= {'z','x','c','v','b'};
		bf.newLine();
		bf.write(ch);
		bf.newLine();
		bf.write("asif");
		bf.flush();
		bf.close();
		System.out.println("open file to see output");
		
		

	}

}
