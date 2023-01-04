package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(105);
		bw.newLine();
		bw.write("asif");
		char [] ch= {'A','l','i'};
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}
