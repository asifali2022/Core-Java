package multiThreading;
class sty extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		  {
			System.out.println("child thread");
			yield();
		  }
}
}
public class yield {

	public static void main(String[] args) {
		
		sty u=new sty();
		u.setPriority(10);
		u.start();
		for(int i=0;i<10;i++)
		  {
			System.out.println("main thread");
		  }

	}

}
