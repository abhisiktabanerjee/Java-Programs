package Collection_Example_3;

import java.util.Comparator;

public class ExpCompare implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		// TODO Auto-generated method stub
		if(t1.exp>t2.exp)
		{
			return 1;
		}
		else if(t1.exp<t2.exp)
		{
			return -1;
		}
		else
			return 0;
	}

}
