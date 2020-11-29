package Collection2;

public class Book implements Comparable<Book> {
	String name;
	String author;
	int quantity;
	
	Book(String name,String author,int quantity)
	{
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
	
	public int compareTo(Book b)
	{  
	    if(quantity>b.quantity)
	    {  
	        return 1;  
	    }
	    else if(quantity<b.quantity)
	    {  
	        return -1;  
	    }
	    else
	    {  
	    	return 0;  
	    }  
	
	}

}
