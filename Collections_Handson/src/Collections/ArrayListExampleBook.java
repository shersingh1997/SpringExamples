package Collections;


import java.util.ArrayList;
import java.util.List;

class Book
{
	int no;
	String name,author,title;
	int quantity;
	public Book(int no,String name, String author, String title, int quantity) {
		super();
		this.no=no;
		this.name = name;
		this.author = author;
		this.title = title;
		this.quantity = quantity;
	}
}
public class ArrayListExampleBook
{
	public static void main(String[] args) {
		

	List<Book> li=new ArrayList<Book>();
	  Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	    li.add(b1);
	    li.add(b2);
	    li.add(b3);
	    
	    for(Book b:li)
	    {
	     
	     System.out.println(b.no+" "+b.name+" "+b.author+" "+b.title+" "+b.quantity);
	    }
	   
	
	}
}
