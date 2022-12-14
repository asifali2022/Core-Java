package multiThreading;
class ThreadB16 extends Thread{
	int total =0;

  @Override
  public void run(){

	synchronized(this){
		System.out.println("Child thread started calculation");
		for (int i=0;i<=10 ; i++){
			total+=i;
		}
		System.out.println("Child thread trying to give notification");
		this.notify();
	}
  }
}
public class notifySleepWait3 {
	public static void main(String[] args)throws InterruptedException {
		ThreadB16 b=new ThreadB16();
		b.start();

		Thread.sleep(10000);//10sec///becuz of sleep waiting main thread
		                    // will not be able to catch the notify msg

	synchronized(b){
		System.out.println("Main thread is calling wait on B object");
		b.wait();
		System.out.println("Main thread got notification");
		System.out.println(b.total);
	}

   }
}