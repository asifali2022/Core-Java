package fileHandling;

import java.io.*;

public class Bufferedreader1 {

	public static void main(String[] args) throws IOException
	{
		
		
		BufferedReader br=new BufferedReader(new FileReader("cad.txt"));
//        //System.out.println(br.read());
		String k=br.readLine();
		
		while(k!=null)
		{
			System.out.println(k);
			 k=br.readLine();
			
		}
		br.close();
//		BufferedReader br1=new BufferedReader(new FileReader("cad.txt"));
//		int l=br1.read();
//		while(l!=-1)
//		{
//			System.out.println((char)l);
//			l=br1.read();
//		}
//	}

}
}
