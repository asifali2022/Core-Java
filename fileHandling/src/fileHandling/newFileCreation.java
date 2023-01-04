package fileHandling;
import java.io.*;


public class newFileCreation {

	public static void main(String[] args) throws Exception {
		
	 File f=new File("cricket.txt");
	 System.out.println(f.exists());
     f.createNewFile();
     System.out.println(f.exists());
     //
     System.out.println("****************");
     File k=new File("ipl team");//name without type jvm treats as directory
     System.out.println(k.exists());//false
     k.mkdir();//creating directory
     System.out.println(k.exists());//true
     System.out.println("****************");
     File f4=new File("salam");
     f4.mkdir();
     System.out.println(f4.isDirectory());
     File f5=new File(f4,"salam");
     f5.createNewFile();
     System.out.println(f5.isFile());
     System.out.println("****************");
     String location="c:\\Users";
     File f8=new File(location);
     f8.mkdir();
     File f9=new File(f8,"nyu.txt");
     f9.createNewFile();
     System.out.println(f9.isFile());
     
	}

}
