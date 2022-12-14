package multiThreading;
class MyThread extends Thread{
	static Thread mt;

	@Override
	public void run(){
			try
			{
				mt.join();
			}
			catch (InterruptedException e)
			{	
				
			}
			
			for (int i=1;i<=10 ;i++ )
			{
				System.out.println("child thread");
			}
		
	}
}
public class Test3 {
	public static void main(String[] args)throws InterruptedException{
		
		MyThread.mt=Thread.currentThread();

		MyThread t=new MyThread();
		t.start();
		t.join();
		
		for (int i=1;i<=10;i++ )
		{
			System.out.println("main thread");
			Thread.sleep(2000);//20sec sleep
		}
			
	}
}