package fileHandling;
import java.io.*;
class Dog1 implements Serializable{
	static 
	{
		System.out.println("static block executed(Dog1)");
	}
	Dog1()
	{
		System.out.println("Dog class constructor");
	}
	int i=20;
	int j=40;
}
class cat implements Serializable{
	static 
	{
		System.out.println("static block executed(cat)");
	}
	cat()
	{
		System.out.println("cat class constructor");
	}
	int i=20;
	int j=40;
}

class serializationAndDeserialization2 
{
	public static void main(String[] args)throws Exception 
	{
		Dog1 d=new Dog1();
		cat c=new cat();
		
		System.out.println("serialization stared");
		String f="wap.ser";
		//File f1=new File(f);
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//
		oos.writeObject(d);
		oos.writeObject(c);
		//
		System.out.println("serialization reference Dog1Object Is ::"+d);
		System.out.println("serialization reference catObject Is ::"+c);
		System.out.println("serialization has ended");
		
		System.in.read();
		//
		System.out.println("De-serialization has started");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		//
		Dog1 d1=(Dog1)ois.readObject();
	    cat c2=(cat)ois.readObject();
	    
	    System.out.println("De-serialization reference Dog1object is ::"+d1.i+"::"+d1.j);
	    System.out.println("De-serialization reference catobject is ::"+c2.i+"::"+c2.j);
	    System.out.println("De-serialization has ended");
	    
	}
	//JVM shutdown now
}
