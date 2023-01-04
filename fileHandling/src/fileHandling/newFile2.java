package fileHandling;

import java.io.*;

public class newFile2 {

	public static void main(String[] args) throws IOException {
		
		String k="qwe.txt";
		File f=new File(k);
		
		System.out.println(f.exists());
		
		System.out.println("****************");
		
		//creating a txt file named qwe
		//check working directory
		f.createNewFile();
		System.out.println(f.exists());

		System.out.println("****************");
		
		//file name without extention is treated as a directory
		File f2=new File("teams");
		System.out.println(f2.exists());

		System.out.println("****************");
		
		f2.mkdir();//making f2 as directory
		System.out.println(f2.exists());

		System.out.println("****************");
		
		//File f=new File(String subdirname,String name);
		File f22=new File("newdir");
		f22.mkdir();
		
		File f21=new File(f22,"poker.txt");
        //new directory named newdir is created without file poker.txt 
		f21.createNewFile();
		// new file poker.txt created in newdir directory
		String d="C:\\Users\\acer\\Desktop\\QS";
		File f9=new File(d,"asifali.txt");
		f9.createNewFile();
		System.out.println(f9.exists());
		System.out.println(f9.isFile());
		System.out.println(f9.isDirectory());
		System.out.println(f22.isDirectory());
		
	}

}
