package multiThreading;
class ttm extends Thread
{
	public static Thread mt;
	@Override
	public void run() {
		  {
			try 
			{
			mt.join();
			
			}
			catch(InterruptedException e)
			{
				
			}
			for(int i=0;i<10;i++)
			{
				System.out.println("child thread");
			}
		  }
}
}
public class join2 {

	public static void main(String[] args) {
		
		ttm.mt=Thread.currentThread();
		ttm u=new ttm();
		u.start();
		
		for(int i=0;i<10;i++)
		  {
			
			try {
				System.out.println("parent Thread");
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}

	}

}
}