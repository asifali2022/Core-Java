package multiThreading;
class   C extends Thread{
	public synchronized void d1(D d){
		System.out.println("Thread-1 starts execution of d1()");
		try{
			Thread.sleep(5000);//5sec
		}
		catch (InterruptedException e){
		}
		System.out.println("Thread-1 trying to call B last()");
		d.last();
	}
	public synchronized void last(){//results in deadlock
		System.out.println("Inside A last() method");
	}
}
class D extends Thread{
	public synchronized void d2(C c){
		System.out.println("Thread-2 starts execution of d2()");
		try{
			Thread.sleep(5000);//5sec
		}
		catch (InterruptedException e){
		}
		System.out.println("Thread-2 trying to call A last()");
		c.last();
	}
	public synchronized void last(){//result in deadlock
		System.out.println("Inside B last() method");
	}
}
public class deadlockInJava2 extends Thread {
	 C c=new C();
	 D d=new D();

	 public void m1(){
		this.start();
		c.d1(d);//line executed by main thread
	 }

	 public void run(){
		d.d2(c);//line executed by child thread
	 }

	public static void main(String[] args){
		deadlockInJava2 t=new deadlockInJava2();
		t.m1();//main thread s executing
	}
}