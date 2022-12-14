package multiThreading;
class mty extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		  {
			System.out.println("child thread");
		  }
}
}
public class priority2 {

	public static void main(String[] args) {
		
		mty u=new mty();
		u.setPriority(10);
		u.start();
		for(int i=0;i<10;i++)
		  {
			System.out.println("main thread");
		  }

	}

}
