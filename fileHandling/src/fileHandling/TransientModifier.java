package fileHandling;

import java.io.*;

class Dog4 implements Serializable{
	static 
	{
		System.out.println("static block executed");
	}
	Dog4()
	{
		System.out.println("Dog class constructor");
	}
	int i=20;
	transient  int j=40;
	transient static int l=50;
	transient final int m=60;
	
}

class TransientModifier 
{
	public static void main(String[] args)throws Exception 
	{
		Dog4 d=new Dog4();
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
	    Dog4 d1=(Dog4)ois.readObject();
	    System.out.println("De-serialization reference object is ::"+d1);
	    System.out.println("De-serialization has ended");
	    System.out.println("value of i ::"+d1.i);
	    System.out.println("value of i ::"+d1.j);
	    System.out.println("value of i ::"+d1.l);
	    System.out.println("value of i ::"+d1.m);
	    
	    
	}
	
	//static Vs transient :
	//1. static variable is not part of object state hence they won't 
	//participate in
	//serialization because of this declaring a static variable as
	//transient there is no use
	//*** meaning no use of transient modifier
	//
	//Transient Vs Final:
	//1. final variables will be participated into serialization directly by their
	//values.
	//Hence declaring a final variable as transient there is no use.
	//the compiler assign the value to final variable
	//***means no use transient modifier
	
	
}
