package homework12;

import java.util.*;

class Student3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student3(String name, int ban, int no, int kor, int eng, int math) {
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
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math 
				+ "," + getTotal() + "," + getAverage();
	}
}

class BanNoAscending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student3 s1 = (Student3) o1;
		Student3 s2 = (Student3) o2;

		if (s1.ban == s2.ban) {
			if(s1.no == s2.no)
				return 0;
			else
				return (s1.no < s2.no ? -1 : 1);
		} else {
			return (s1.ban < s2.ban ? -1 : 1);
		}
	}

}

public class Exercise4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(new Student3("ÀÌÀÚ¹Ù", 2, 1, 70, 90, 70));
		list.add(new Student3("¾ÈÀÚ¹Ù", 2, 2, 60, 100, 80));
		list.add(new Student3("È«±æµ¿", 1, 3, 100, 100, 100));
		list.add(new Student3("¿©µ¿ºó", 1, 1, 90, 70, 80));
		list.add(new Student3("±èÀÚ¹Ù", 1, 2, 80, 80, 90));

		Collections.sort(list, new BanNoAscending());

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
