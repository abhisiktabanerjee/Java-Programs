package Collection_Example_3;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortExample {
	public static void main(String args[])
	{
		String arr[]={"Ram,History,2","Yash,Physics,4","Rahul,Physics,2","Varun,Computer,6"};
		ArrayList<Teacher> list=new ArrayList<Teacher>();
		ArrayList<Teacher> flist=new ArrayList<Teacher>();
		
		for(String s:arr)
		{
			String local[]=s.split(",");
			Teacher t=new Teacher(local[0],local[1],Integer.parseInt(local[2]));
			list.add(t);
		}
		
		Collections.sort(list,new SubjectCompare());
		flist.addAll(list);
		Collections.sort(flist,new ExpCompare());
		
		for(Teacher t:flist)
		{
			System.out.println(t.name +" "+ t.subject + " " + t.exp);
			
		}
		
	}

}
