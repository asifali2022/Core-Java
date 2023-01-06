package serialversionUID;

import java.io.*;

public class ReceiverApp 
{
public static void main(String[] args) throws
IOException,ClassNotFoundException
{
FileInputStream fis=new FileInputStream("lop.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dog669 d2=(Dog669) ois.readObject();
System.out.println(d2.i+"=====>"+d2.j);
}
}

//D:\TestApp>javac Dog.java
//D:\TestApp>java Sender
//D:\TestApp>javac Dog.java
//D:\TestApp>java ReceiverApp
//10=====>20