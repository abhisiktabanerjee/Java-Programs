package Collection_Example_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String args[])
	{
		String str1[]={"b","c","d","a","f","e"};
		String str2[]={"b","c","c","a","b"};
		int i;
		int j;
		
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		for(String s:str1)
		{
			list1.add(s);
		}
		for(String s:str2)
		{
			list2.add(s);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1);
		System.out.println(list2);

		String [] loc1 = list1.toArray(new String[list1.size()]);
		String [] loc2 = list2.toArray(new String[list1.size()]);
		ArrayList<String> arr3=new ArrayList<String>();
		ArrayList<String> arr4=new ArrayList<String>();
		
		
		for(i=0;i<list1.size();i++)
		{
		
			for(j=0;j<list2.size();j++)
			{
				if(list1.get(i).equals(list2.get(j)))
				{
					list1.remove(i);
					list2.remove(j);
					i--;
					break;
				}
		
			}
		}
		System.out.println(list1);
		System.out.println(list2);

				
			
		

	}
	
	
}
