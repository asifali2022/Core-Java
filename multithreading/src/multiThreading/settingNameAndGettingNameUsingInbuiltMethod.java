package multiThreading;
class cabs implements Runnable
{   @Override
	public void run()
	{
	    String s="ChildThread";
		Thread.currentThread().setName(s);
		System.out.println("Name of Thread:"+Thread.currentThread().getName());
	 
	}
 
	
}
public class settingNameAndGettingNameUsingInbuiltMethod {

	public static void main(String[] args) {
		
		cabs a=new cabs();
		Thread t=new Thread(a);
		t.start();
		Thread.currentThread().setName("MainThread");;
		System.out.println("Name Of Thread:"+Thread.currentThread().getName());
		

	}

}
