package operation;

public class Ex4 {
	public static void main (String[] args) {
		int pencil = 534;
		int student = 30;
		
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencil / student;
		System.out.println(pencilsPerStudent);
		
		// ���� ���� ��
		int pencilsLeft = pencil % student;
		System.out.println(pencilsLeft);
	}
}
