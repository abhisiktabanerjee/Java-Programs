package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String arr[]={"Ferouzan Electronics","Herbert Java","Ferouzan Electronics","Galvin OS","Ferouzan Electronics"};
		ArrayList<Book> set=new ArrayList<Book>();
		HashSet<String> arr1=new HashSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			arr1.add(arr[i]);
		}
		for(String s:arr1)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(s.equals(arr[j]))
				{
					count++;
				}
			}
			String loc[]=s.split(" ");
			Book b=new Book(loc[0],loc[1],count);
			
			set.add(b);
			
		}
		
		Collections.sort(set);	
		
		for(Book b:set)
		{  
		    System.out.println(b.author+" "+b.name+" "+b.quantity);
		}
		
	}
}

