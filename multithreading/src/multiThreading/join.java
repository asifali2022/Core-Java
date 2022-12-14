package multiThreading;
class stm extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		  {
			System.out.println("child thread");
			try 
			{
			sleep(5000);
			}
			catch(InterruptedException e)
			{
				
			}
			
		  }
}
}

public class join {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		stm u=new stm();
		u.start();
		u.join(5000);
		for(int i=0;i<10;i++)
		  {
			System.out.println("main thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}	
			
		  }

	}
}

	