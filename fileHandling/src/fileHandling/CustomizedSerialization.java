package fileHandling;
import java.io.*;
class Account implements Serializable
{
     String name="sachin";
     transient String password="tendulkar";
     
     //
     private void writeObject(ObjectOutputStream oos) throws IOException{
    	 oos.defaultWriteObject();//performing default Serialization
    	 String epwd="123"+password;//performing encryption
    	 oos.writeObject(epwd);//write the encrypted data to file(abc.ser)
    	 }
    	 private void readObject(ObjectInputStream ois)throws Exception{
    	 ois.defaultReadObject();//performing default Serialization
    	 String epwd=(String)ois.readObject();//performing decryption
    	 password=epwd.substring(3);//writing the extra data to Object
    	 }
}
public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//During default Serialization there may be a chance of loss
		//of information due to
		//transient keyword.
		Account acc=new Account();
		
		System.out.println(acc.name +"=====> "+ acc.password);
		System.out.println("Serialization Started");
		
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(acc);
		
		System.out.println("Serialization ended");
		
		System.out.println("***********************************");
		
		System.out.println("DeSerialization Started");
		
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		acc=(Account)ois.readObject();
		
		System.out.println(acc.name +"=====> "+ acc.password);
		System.out.println("DeSerialization ended");
	}

}
///

