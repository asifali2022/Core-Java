package fileHandling;
import java.io.*;

public class printwriter {

	public static void main(String[] args) throws IOException
	{
	
		File f=new File("cad.txt");
		FileWriter fr=new FileWriter(f,true);
		PrintWriter pw=new PrintWriter(fr);
		pw.write(111);
		pw.write('\n');
		pw.print(true);
		pw.write('\n');
		pw.print("asif ali");
		pw.write('\n');
		pw.print(18);
		pw.write('\n');
		pw.print('o');
		pw.flush();
		pw.close();
		System.out.println("open file to see output");
	}

}
