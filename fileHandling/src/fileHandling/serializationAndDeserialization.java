package fileHandling;

import java.io.*;
/*
 public java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException;
 public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final void writeObject(java.lang.Object) throws java.io.IOException;

 public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
 public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final java.lang.Object readObject() throws java.io.IOException, java.lang.ClassNotFoundException;
*/

class Dog implements Serializable{
	static 
	{
		System.out.println("static block executed");
	}
	Dog()
	{
		System.out.println("Dog class constructor");
	}
	int i=20;
	int j=40;
}

class serializationAndDeserialization 
{
	public static void main(String[] args)throws Exception 
	{
		Dog d=new Dog();
		System.out.println("serialization stared");
		String f="sab.ser";
		//File f1=new File(f);
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("serialization reference Object Is ::"+d);
		System.out.println("serialization has ended");
		
		System.in.read();
		
		System.out.println("De-serialization has started");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
	    Dog d1=(Dog)ois.readObject();
	    System.out.println("De-serialization reference object is ::"+d1);
	    System.out.println("De-serialization has ended");
	    
	}
	//JVM shutdown now
}

