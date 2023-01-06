package serialversionUID;

import java.io.*;

public class Sender 
{
public static void main(String[] args)throws IOException {

	Dog669 d=new Dog669();

FileOutputStream fos=new FileOutputStream("lop.ser");

ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(d);}
}