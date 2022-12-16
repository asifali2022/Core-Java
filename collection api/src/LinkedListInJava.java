import java.util.*;
public class LinkedListInJava {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(25);
		l.add(25002);
		l.add('s');
		l.add("sw");
		l.add(true);
		System.out.println(l);
		System.out.println("**************");
		//using Iterator to print the objects
		 Iterator itr= l.iterator();
		 while(itr.hasNext())
		 {
			  Object obj=itr.next();
			  System.out.println(obj);
		 }
		 System.out.println("**************");
		 //using listIerator to print the objects
		 LinkedList m=new LinkedList();
		 m.add(false);
		 m.add(2600);
		 m.add("asad");
		 m.add('q');
		 ListIterator kl=m.listIterator();
		 while(kl.hasNext())
		 {
			 Object obj=kl.next();
			  System.out.println(obj);
		 }
		 System.out.println("**************");
		 //using DecendingIterator to print the objects
		 // for reverse printing of elements
		  Iterator p=m.descendingIterator();
		  while(p.hasNext())
			 {
				 Object obj=p.next();
				  System.out.println(obj);
			 }
		  System.out.println("**************");
		  //Inbuild method
		  //
		  m.addFirst(789);
		  System.out.println(m);
		  System.out.println("**************");
		  
	}

}
