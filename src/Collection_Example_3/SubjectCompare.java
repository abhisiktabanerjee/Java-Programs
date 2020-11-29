package Collection_Example_3;

import java.util.Comparator;

public class SubjectCompare implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		// TODO Auto-generated method stub
		return t1.subject.compareTo(t2.subject);
	}

}
