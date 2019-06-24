package basicAPI;

import java.util.*;

public class CompareEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(10);
		Student s2 = new Student(10);
		
		// compare�� static method, ����° �Ű������� ������ ���������μ� ���ϴ� ���Լ��� ���� �� ����
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