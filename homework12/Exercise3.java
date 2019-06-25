package homework12;

import java.util.*;

class Student2 implements Comparable {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student2) {
			Student2 tmp = (Student2) o;
			return name.compareTo(tmp.name);
		} else {
			return -2;
		}
	}

}

public class Exercise3 {
	static int getGroupCount(TreeSet tset, int from, int to) {

		TreeSet result = new TreeSet();

		for (Object o : tset) {
			Student2 tmp = (Student2) o;
			result.add((int) tmp.getAverage());
		}
		return result.subSet(from, to).size();
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Student2 s1 = (Student2) o1;
				Student2 s2 = (Student2) o2;
				float f1 = s1.getAverage();
				float f2 = s2.getAverage();

				if (f1 == f2)
					return 0;
				return (f1 < f2 ? -1 : 1);
			}

		});

		set.add(new Student2("È«±æµ¿", 1, 1, 100, 100, 100));
		set.add(new Student2("¿©µ¿ºó", 1, 2, 90, 70, 80));
		set.add(new Student2("±èÀÚ¹Ù", 1, 3, 80, 80, 90));
		set.add(new Student2("ÀÌÀÚ¹Ù", 1, 4, 70, 90, 70));
		set.add(new Student2("¾ÈÀÚ¹Ù", 1, 5, 60, 100, 83));

		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
