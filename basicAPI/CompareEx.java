package basicAPI;

import java.util.*;

public class CompareEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(10);
		Student s2 = new Student(10);
		
		// compare는 static method, 세번째 매개변수를 적절히 수정함으로서 원하는 비교함수를 만들 수 있음
		int result = Objects.compare(s1, s2, new StudentComparator());
		
		System.out.println(result);
	}

}

class Student {
	int id;
	
	Student(int id) {
		this.id = id;
	}
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.id > s2.id) {
			return -1;
		} else if (s1.id < s2.id) {
			return 1;
		} else {
			return 0;
		}
	}
	
}