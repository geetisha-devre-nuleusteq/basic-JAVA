package MapsConcepts29july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparable demo
public class ComparableDemo {
	public static void main(String... ar) {
		ArrayList<Demo> list = new ArrayList<Demo>();
		list.add(new Demo(1, "hello"));
		list.add(new Demo(5, "sorting"));
		list.add(new Demo(3, "hii"));
		list.add(new Demo(2, "rollno"));
		list.add(new Demo(4, "student"));
		Collections.sort(list);
		System.out.println("after sorting list is");
		for (Demo demo : list) {
			System.out.println(demo.getRoll());
			System.out.println(demo.getName());
		}
	}

}

class Demo implements Comparator<Demo>, Comparable<Demo> {
	private int roll;
	private String name;

	public int compareTo(Demo d) {
		return this.roll - d.roll;
	}

	@Override
	public int compare(Demo o1, Demo o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	public Demo(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}
}
