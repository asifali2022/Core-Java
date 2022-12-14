package multiThreading;
class childThread extends Thread
{   @Override
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("child thread");
	}
	
	}
	
}

public class start_run_method_in_multiThreading {

	public static void main(String[] args) {
		
		childThread ch=new childThread();
		ch.start();
	
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}

	}

}
