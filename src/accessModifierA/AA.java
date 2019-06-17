package accessModifierA;

public class AA {

	// 클래스 안에서 클래스 객체를 생성한다고 무한 생성되는 것이 아님
	// 생성자를 호출하고 끝
	AA a1 = new AA();

	int valueA = 1;

	// 필드 접근제한자
	public int aa1;
	int aa2;
	private int aa3;

	// setter / getter
	void setter(int a) {
		aa3 = a;
	}
	
	public int getter() {
		return aa3;
	}

	// 메소드 접근제한자
	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}

}
