import java.util.*;
public class ArraylistInJava {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList ai= new ArrayList();
		ai.add(3214);
		ai.add("tyupuh");
		ai.add('p');
		System.out.println(ai);
		System.out.println("***************");
		// accessing element using iterator
		Iterator itr=ai.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("***************");
	    // accessing and object class
	    ArrayList ai1= new ArrayList();
		ai1.add(1212);
		ai1.add(456);
		ai1.add(9877);
		ai.add(32145);
		Iterator itr1=ai1.iterator();
	    while(itr1.hasNext())
	    {
	    	 Object obj= itr1.next();
	    	 System.out.println(obj);
	    }
	    //collecting /iterating over integer no and 
	    // STORING THEM IN iNTEGER CLASS WE TYPECASTE
	     System.out.println("***************");
	    Iterator itr2=ai1.iterator();
	     while(itr2.hasNext())
	     {
	    	 Integer i=(Integer) itr2.next();
	    	 System.out.println(i);
	     }
         System.out.println("****************");
         // accessing using ListIiterator
         ArrayList qw=new ArrayList();
         qw.add(250);
         qw.add('h');
         qw.add("europe");
         qw.add(950);
         qw.add(null);
         ListIterator jk= qw.listIterator();
         while(jk.hasNext())
         {
        	 Object obj=jk.next();
        	 System.out.println(obj);
         }
         System.out.println("******************");
         //inbuild methods of arraylist
         //
            Object obj= qw.indexOf(250);
            Integer j=(Integer) qw.indexOf(250);
            System.out.println(obj+" : "+j);
            System.out.println("******************");
           //getting size of arraylist and trimming of size of arraylist
            int i=qw.size();
             qw.trimToSize();
             System.out.println(qw);
            System.out.println(i);
            //
            System.out.println("******************");
            // checking if arraylist is empty
             boolean b=qw.isEmpty();
             System.out.println(b);
             //getting runtime class of collection
             System.out.println("******************");
             Object jui=qw.getClass();
             System.out.println(jui);
            // ensuring minimum capacity
             System.out.println("******************");
             qw.ensureCapacity(25);
             System.out.println(qw.size());
             //contains method in arraylist
             System.out.println("******************");
             boolean n=qw.contains(546);
             System.out.println(n);
             boolean ns=qw.contains(950);
             System.out.println(ns);
             //clear() method in arraylist
             System.out.println("******************");
             qw.clear();
             System.out.println(qw);
             
             
             
             
	}

}
