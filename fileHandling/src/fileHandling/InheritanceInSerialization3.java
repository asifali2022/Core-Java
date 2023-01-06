package fileHandling;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
class Animal1 {
int i=10;
Animal1(){
System.out.println("No arg Animal constructor");
}
}
class Dog77 extends Animal1 implements Serializable{
int j=20;
Dog77(){
System.out.println("No arg Dog constructor");
}
}
public class InheritanceInSerialization3 {
public static void main(String[] args)throws
IOException,ClassNotFoundException{
Dog77 d=new Dog77();
d.i=888;
d.j=999;
System.out.println("Serialization started");FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d);
System.out.println("Serialization ended");
System.out.println("******************************");
System.out.println("DeSerialization started");
FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dog77 d1=(Dog77)ois.readObject();
System.out.println(d1.i+"====> "+d1.j);
System.out.println("DeSerialization ended");
}
}
