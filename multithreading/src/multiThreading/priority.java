package multiThreading;
class rty extends Thread
{
	@Override
	public void run() {
	Thread.currentThread().setPriority(9);
	System.out.println(Thread.currentThread().getPriority());
}
}


public class priority {

	public static void main(String[] args) {
        
	  rty u=new rty();
		u.start();
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		

	}

}
