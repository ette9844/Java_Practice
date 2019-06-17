package operation;

public class Ex4 {
	public static void main (String[] args) {
		int pencil = 534;
		int student = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencil / student;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = pencil % student;
		System.out.println(pencilsLeft);
	}
}
