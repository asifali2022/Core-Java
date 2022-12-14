package multiThreading;
/*
	interface Runnable{
		public abstract void run();
	}
	class Thread implements Runnable
	{
		//Heart of MultiThreading
		public void start(){
			1. Register the thread with ThreadScheduler
			2. All other mandatory low level activities(memory level)
			3. invoke or call run() method
		}
		public void run()
		{
			//no implementation
		}
	}
	class abs implements runnable extends thread
*/
class abs implements Runnable
{   @Override
	public void run()
	{
	  for(int i=0;i<10;i++)
	  {
		System.out.println("child thread");
	  }
	}
	
}

public class multiThreading_Using_interface {

	public static void main(String[] args) {
		
		abs a=new abs();
		Thread t=new Thread(a);
		t.start();
		for(int i=0;i<10;i++)
		  {
			System.out.println("main thread");
		  }
	}

}
