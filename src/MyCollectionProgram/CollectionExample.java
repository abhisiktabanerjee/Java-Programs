package MyCollectionProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hi Abhisikta hope you are doing great I am new to Java and want to learn collections as collections is the main things in Java data structure");
		//System.out.println(str.charAt(0));
		
		//int n=str.length();
		//String arr[]=new String[n];
		
		
		HashSet<String> set=new HashSet<String>(); 
		ArrayList<String> list=new ArrayList<String>();

		for(String str1:str.split(" "))
		{
			set.add(str1);
		}
		for(String str1:str.split(" "))
		{
			list.add(str1);
		}
		for(String s:set)
		{
			int count=0;
			for(String s1:list)
			{
				if(s.equals(s1))
				{
					count++;
				}
			}
			System.out.println(s + "-" + count);
		}
		
		System.out.println(set);
		
		
//		for(int i=0;i<c.length;i++)
//		{
//			set.add(c[i]));
//		}
//		
//		

	}

}
