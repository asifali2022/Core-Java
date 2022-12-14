package multiThreading;
class child extends Thread
{   @Override
	public void run()
	{
	
	//Compulsory run method should be overridden
	
	}
	
}

public class lauch2 {

	public static void main(String[] args) {
		
		child ch=new child();
		ch.start();//start () will create a thread and 
		           //register it with threadScheduler(TS) 
		           //and TS now has two thread one main thread
		           //another  child thread it is upto TS which to
		           // execute but 90% of  time priority is given to
		           // main thread but not always if we just called run()
		           // only run() will be executed no multi threading will
		           // happen we should always use start() method for multiThreading
	
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}

	}

}
