package multiThreading;

class ThreadB7 extends Thread{
	int total =0;

  @Override
  public void run(){

	synchronized(this){
		System.out.println("Child thread started calculation");
		for (int i=0;i<=100 ; i++){
			total+=i;
		}
		System.out.println("Child thread trying to give notification");
		this.notify();
	}
  }
}
public class notifySleepWait4 {
	public static void main(String[] args)throws InterruptedException {
		ThreadB7 b=new ThreadB7();
		b.start();

	synchronized(b){
		System.out.println("Main thread is calling wait on B object");
		b.wait(10000);//10sec
		System.out.println("Main thread got notification");
		System.out.println(b.total);
	}

  }
}