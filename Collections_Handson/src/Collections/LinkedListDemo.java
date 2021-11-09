package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args)
	{
		 LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  System.out.println(al);
		  al.addFirst("RAJA");
		  al.addLast("Shyam");
		  System.out.println(al);
		  
//		  Iterator<String> itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
	}

}
	
