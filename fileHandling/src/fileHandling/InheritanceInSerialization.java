package fileHandling;
import java.io.*;
                 
  class Animal implements Serializable
  {
  int i=10;
}
class Dog88 extends Animal
   {
   int j=20;
   }
public class InheritanceInSerialization 
{
public static void main(String[] args)throws IOException,ClassNotFoundException{

	Dog88 d=new Dog88();
    System.out.println("Serialization started");
    FileOutputStream fos=new FileOutputStream("abc.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(d);
    System.out.println("Serialization ended");
    
    System.out.println("******************************");

    System.out.println("DeSerialization started");
    FileInputStream fis=new FileInputStream("abc.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Dog88 d1=(Dog88)ois.readObject();
    
    System.out.println(d1.i+"====> "+d1.j);
    
    System.out.println("DeSerialization ended");
}
}

