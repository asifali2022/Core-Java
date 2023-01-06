package fileHandling;
import java.io.*;


class Dog45 implements Serializable
{
Cat45 c=new Cat45();
}
class Cat45 implements Serializable
{
Rat45 r=new Rat45();
}
class Rat45 implements Serializable
{
int i=10;
}
 public class SerializationObject  {

	 public static void main(String[] args)throws
                      IOException,ClassNotFoundException{

	Dog45 d= new Dog45();

	System.out.println("Serialization Started");

	FileOutputStream fos= new FileOutputStream("abc.ser");

	ObjectOutputStream oos=new ObjectOutputStream(fos);

	oos.writeObject(d);

	System.out.println("Serialization ended");

	System.out.println("***********************************");

	System.out.println("DeSerialization Started");

	FileInputStream fis= new FileInputStream("abc.ser");

	ObjectInputStream ois=new ObjectInputStream(fis);

	Dog45 d1=(Dog45)ois.readObject();

	System.out.println(d1.c.r.i);

	System.out.println("DeSerialization ended");
}
}
