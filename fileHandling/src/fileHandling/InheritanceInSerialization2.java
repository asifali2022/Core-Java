package fileHandling;
import java.io.*;

class Animal9 
{
int i=10;
Animal9()
{
      System.out.println("No arg Animal constructor");
}
}
class Dog98 extends Animal9 implements Serializable{

	int j=20;
	Dog98(){
      System.out.println("No arg Dog constructor");
}
}

public class InheritanceInSerialization2 
{
public static void main(String[] args)throws IOException,ClassNotFoundException{

	Dog98 d=new Dog98();
	d.i=888;
	d.j=999;
  System.out.println("Serialization started");
  FileOutputStream fos=new FileOutputStream("abc.ser");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(d);
  System.out.println("Serialization ended");
  
  System.out.println("******************************");

  System.out.println("DeSerialization started");
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Dog98 d1=(Dog98)ois.readObject();
  
  System.out.println(d1.i+"====> "+d1.j);
  
  System.out.println("DeSerialization ended");
}
}
