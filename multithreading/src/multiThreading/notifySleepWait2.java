package multiThreading;
class ThreadB15 extends Thread{
	int total =0;

	@Override
	public void run(){
		for (int i=0;i<=10 ; i++){
			total+=i;
		}
	}
}
public class notifySleepWait2 {
	public static void main(String[] args)throws InterruptedException {
		ThreadB15 b=new ThreadB15();
		b.start();

		b.join();//using join method
		System.out.println(b.total);
	}
}