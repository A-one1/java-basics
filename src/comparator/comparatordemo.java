package comparator;

import java.util.ArrayList;
import java.util.Collections;

class comparatordemo {
	public static void main (String[] args) {
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(new Employee(31, "bbbb", 777));
		ar.add(new Employee(07, "cccc", 900));
		ar.add(new Employee(99, "aaaa", 1010));

		System.out.println("Unsorted");
		for (Employee s : ar)
			System.out.println(s);
		System.out.println("");

		Collections.sort(ar, new Sortbyid());
		System.out.println("Sorted by id in descending order");
		for (Employee s1 : ar)
			System.out.println(s1);
		System.out.println("");

		Collections.sort(ar, new Sortbyname());
		System.out.println("Sorted by name in descending order");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}