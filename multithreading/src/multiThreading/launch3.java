package multiThreading;
class child1 extends Thread   
{   
	@Override
	
	public void run()
	{
	
	for(int i=0;i<10;i++)
	{
		System.out.println("child thread");
	}
	for(int i=1;i<999;i++) {
		i=i*i;
		System.out.print(i+" ");
		i++;
		if(i>100) {System.out.println();}
	}
	
	}
	
}

public class launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 ch=new child1();
	    ch.start();
	
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}

}












