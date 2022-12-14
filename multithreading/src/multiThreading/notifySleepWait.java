package multiThreading;
class ThreadB extends Thread{
	int total =0;

	@Override
	public void run(){
		for (int i=0;i<=10 ; i++){
			total+=i;
		}
	}
}
public class notifySleepWait {
	public static void main(String[] args)throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();

		Thread.sleep(2000);//using sleep
		System.out.println(b.total);
	}
}

 