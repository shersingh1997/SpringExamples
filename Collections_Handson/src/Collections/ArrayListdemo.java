package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListdemo {

	public static void main(String[] args) 
	{
		List<String>alist=new ArrayList<>();
		
		alist.add("ram"); //add element
		alist.add("Shyam");
		alist.add("Raju");
		alist.add("Satya");
		alist.add("Praful");
		
	//	System.out.println(alist);	
		List<String>newlist=new ArrayList<String>();
		newlist.addAll(alist); // creating new list
	//	System.out.println(newlist);
		System.out.println(alist.get(2));//random acess
		
		
		Iterator<String>it=alist.iterator(); //iterator
	    while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	    
	    alist.set(1, "mukesh"); // set element
	    System.out.println(alist);
	    System.out.println(alist.size());
	    System.out.println(alist.contains("ram"));
	    System.out.println();
	   // alist.toArray();
	    
	   Collections.sort(alist);
	   System.out.println(alist);
	}

}
