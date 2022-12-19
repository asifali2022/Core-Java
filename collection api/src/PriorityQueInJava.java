import java.util.*;
public class PriorityQueInJava {

	public static void main(String[] args) {
		
		
		PriorityQueue o= new PriorityQueue();
		try{

		o.add(100);
		o.add(50);
		o.add(150);
		o.add(25);
		o.add(75);
		o.add(125);
		o.add(175);
		
//		System.out.println(o);
//		System.out.println("*************");
		o.add("asif");
		o.add("7777");
		o.add("789");
		o.add("5858");
		//o.add(null);
		}
		catch(ClassCastException e)
		{
			System.out.println("Objects  are non-comparable");
		}
		catch(NullPointerException e)
		{
			System.out.println("PriorityQueue doesn’t permit null");
		}
		System.out.println(o);
		//PriorityQueue doesn’t permit null.
		//We can’t create a PriorityQueue of Objects that are non-comparable
		
		//indexing is not allowed in priorityqueue so we are converting
		// to arraylist and indexing
		//try catch has been used to demonstrate these
		
		ArrayList il=new ArrayList();
//		il.add(o);
//		System.out.println(il);
//		System.out.println(il.contains(100));//fase
		il.addAll(o);
		System.out.println(o);
		System.out.println(il.contains(100));//true
		
		//iterator in priority queue
		System.out.println("*********");
		Iterator k=o.iterator();
		while(k.hasNext())
		{
			Integer I=(Integer)k.next();
			System.out.println(I);
		}
	

	}

}
