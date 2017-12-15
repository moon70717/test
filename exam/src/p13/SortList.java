package p13;

import java.util.Comparator;

public class SortList implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		Student s1 = (Student) p1;
		Student s2 = (Student) p2;
		int temp1 = s1.getAge();
		int temp2 = s2.getAge();
		if (temp1 < temp2) {
			return -1;
		}
		else if (temp1 > temp2) {
			return 1;
		}
		return 0;
	}
}
