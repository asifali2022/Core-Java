package multiThreading;
class Display
{
public synchronized void wish(String name)
{
for (int i=1;i<=10 ;i++ )
{
System.out.print("Good Morning: ");
try
{
Thread.sleep(2000);
}
catch (InterruptedException e)
{
	
}
System.out.println(name);
}

}

}


class MThread extends Thread
{
Display d;
String name;
MThread(Display d,String name)
{
this.d=d;
this.name=name;
}
@Override
public void run(){
d.wish(name);
}

}

public class synchorization
{
public static void main(String... args)throws InterruptedException
{
Display d=new Display();
MThread t1= new MThread(d,"dhoni");
MThread t2= new MThread(d,"yuvi");
t1.start();
t2.start();
}

}

