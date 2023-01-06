package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog12 implements Serializable{
	static 
	{
		System.out.println("static block executed(Dog1)");
	}
	Dog12()
	{
		System.out.println("Dog class constructor");
	}
	int i=20;
	int j=40;
}
class cat1 implements Serializable{
	static 
	{
		System.out.println("static block executed(cat)");
	}
	cat1()
	{
		System.out.println("cat class constructor");
	}
	int i=50;
	int j=60;
}
class rat implements Serializable
{
	static 
	{
		System.out.println("static block executed(rat)");
	}
	rat()
	{
		System.out.println("rat class constructor");
	}
	int i=70;
	int j=80;
}

class OrderOfSerializationNotKnown 
{
	public static void main(String[] args)throws Exception 
	{
		Dog12 d=new Dog12();
		cat1 c=new cat1();
		rat r=new rat();
		
		System.out.println("serialization stared");
		String f="wap.ser";
		//File f1=new File(f);
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		//
		System.out.println("serialization reference Dog1Object Is ::"+d);
		System.out.println("serialization reference catObject Is ::"+c);
		System.out.println("serialization reference ratObject Is ::"+r);
		System.out.println("serialization has ended");
		
		System.in.read();
		//
		System.out.println("De-serialization has started");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		//
		Object o=ois.readObject();
		if(o  instanceof Dog12) 
		{
		    Dog12 d1=(Dog12)o;
		}
		if(o  instanceof cat1) 
		{
	        cat1 c2=(cat1)o;
		}
		if(o  instanceof rat) 
		{
		    rat r1=(rat)o;
		}
	   
	    System.out.println("De-serialization has ended");
	    System.out.println(o);
	    System.out.println(o);
	    System.out.println(o);
	}
	//JVM shutdown now
}

