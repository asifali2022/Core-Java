package fileHandling;

import java.io.*;

public class namesOfAllFilesAndDirectory {

	public static void main(String[] args) {
		
		int javaFileCount=0;
		int txtFileCount=0;
		int pngFileCount=0;
		int zipFileCount=0;
		int otherFileCount=0;
		int dirCount=0;
		int fileCount=0;
		
		
		String df="C:\\Users\\acer\\Desktop\\liveClassesNotes";
		File f=new File(df);
		System.out.println(f.exists());
		//
		String[] listAllFileAndDir=f.list();
		
		for(String asif:listAllFileAndDir)
		{
		 File f2=new File(f,asif);
		 if(f2.isDirectory())
		 {
			 dirCount++;
		 }
		 else if(f2.isFile())
		 {    
			 fileCount++;
		 
			if(asif.endsWith(".txt")) 
			{
				txtFileCount++;
			}
			if(asif.endsWith(".png")) 
			{
				pngFileCount++;
			}
			if(asif.endsWith(".zip")) 
			{
				zipFileCount++;
			}
			if(asif.endsWith(".java")) 
			{
				javaFileCount++;
			}
			else
			{
				otherFileCount++;
			}
		 }
		 System.out.println(asif);
	    }
		System.out.println("Total no of pngfiles  is :: "+pngFileCount);
		System.out.println("Total no of txtfiles  is :: "+txtFileCount);
		System.out.println("Total no of Zipfiles  is :: "+zipFileCount);
		System.out.println("Total no of Directory is :: "+dirCount);
		System.out.println("Total no of files is :: "+fileCount);
		System.out.println("Total no of otherfiles is :: "+otherFileCount);
		System.out.println("Total no of javafiles is :: "+javaFileCount);

}
}
