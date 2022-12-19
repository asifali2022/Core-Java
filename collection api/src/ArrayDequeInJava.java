import java.util.*;

public class ArrayDequeInJava {

	public static void main(String[] args) {
		
		ArrayDeque h=new ArrayDeque();
		h.add(25000);
		h.add('j');
		h.add("lopez");
		h.add(false);
		System.out.println(h);
		System.out.println("*************");
		// using inbuild method in ArrayDeque
		ArrayDeque m=new ArrayDeque();
		m.addFirst("jkj");
		m.add(true);
		m.add(2600);
	    System.out.println(m);
	    m.addFirst(1000);
	    m.addLast(200000);
	    System.out.println(m);
		
	    //using descendingIterator
	    System.out.println("**********");
	    Iterator mk=m.descendingIterator();
	    while(mk.hasNext())
	    {
	    Object o =mk.next();
	    System.out.println(o);
	    }
	     
	    //using Iterator
	    System.out.println("**********");
	    Iterator ml=m.iterator();
	    while(ml.hasNext())
	    {
	    Object o =ml.next();
	    System.out.println(o);
	    }
	          

	}

}
