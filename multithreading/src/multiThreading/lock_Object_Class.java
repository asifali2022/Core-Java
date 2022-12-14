package multiThreading;
class Display1
{
public synchronized void displayNumbers()
{
for (int i=1;i<=10 ;i++ )
{
System.out.print(i);
try
{
Thread.sleep(2000);
}
catch (InterruptedException e)
{
	
}// catch block end

}//for loop ends

}//method ends

public synchronized void displayCharacters()
{
for (int i=65;i<=75 ;i++ )
{
	System.out.print((char)i);
try
{

	Thread.sleep(2000);
}
catch (InterruptedException e)
{
	
}

}

}

}

class MyThread1 extends Thread
{

	Display1 d;

	MyThread1(Display1 d)
	{

		this.d=d;

	}
	

	@Override

	public void run(){

		d.displayNumbers();

	}
    }

 
class MyThread2 extends Thread
{

	Display1 d;

	MyThread2(Display1 d){

		this.d=d;
}

	@Override

	public void run()
	{

		d.displayCharacters();
}
	
}

public class lock_Object_Class {
	
public static void main(String... args){
	

	Display1 d1=new Display1();

	MyThread1 t1= new MyThread1(d1);

	MyThread2 t2= new MyThread2(d1);

	t1.start();

	t2.start();
}
}