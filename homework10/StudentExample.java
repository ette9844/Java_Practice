package homework10;

import java.util.HashMap;

// p567 3��
public class StudentExample {

	public static void main(String[] args) {
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");

		// new Student("1")�� ������ �о��
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);
	}

}

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student compareStu = (Student) obj;
			
			if (this.studentNum == compareStu.studentNum)
				return true;
		}
		return false;
	}
	
	// ���ڿ� �ʵ� ���� hashCode override
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}
