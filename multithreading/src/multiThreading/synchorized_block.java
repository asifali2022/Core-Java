package multiThreading;
class Display143
{
	public void wish(String name){
		;;;;;;;;;;;;; //l-lakh lines of code

		//lock of class level, so only thread can access this region as it is critical
		synchronized(Display143.class){
			System.out.println("Thread which is getting the lock is :: "+Thread.currentThread().getName());
			
			for (int i=1;i<=5;i++ ){
				System.out.print("Good morning:");
					try{
						Thread.sleep(2000);
					}catch (InterruptedException e){}
			
				System.out.println(name);
			}
		}
		System.out.println("Thread which is releasing the lock is :: "+Thread.currentThread().getName());
	    ;;;;;;;;;;;;;//1-lakh lines of code
	}
}
class MyThread123 extends Thread
{
	Display143 d;
	String name;

	MyThread123(Display143 d,String name){
		this.d = d;
		this.name =name;
	}

	@Override
	public void run(){
		d.wish(name);
	}
}

public class synchorized_block  {
	public static void main(String[] args){

		Display143 d1 = new Display143();
		Display143 d2 = new Display143();

		MyThread123 t1= new MyThread123(d2,"yuvi");
		MyThread123 t2= new MyThread123(d1,"dhoni");
		
		t1.setName("yuvi thread");
		t2.setName("dhoni thread");
		
		t1.start();
		t2.start();
	
	}

}

