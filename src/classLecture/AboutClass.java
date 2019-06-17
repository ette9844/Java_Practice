package classLecture;

// 한 파일당 여러 클래스를 넣는 것은 좋은 방식이 아니다 (찾기 어려움)
// 객체지향 프로그래밍을 해치는 기능 static

// class 앞에 public이 붙는것은 java파일당 무조건 하나
// public이 붙는 클래스는 파일명과 동일해야함

// p236
// static으로 쓰인 모든 코드가 먼저 RAM에 올라가 읽힘 -> 바로 작동
class AboutClass {

	// 정적 필드
	static int value = 10;

	static {
		// static을 사용하면 필드에서도 값 변경 가능
		value = 20;
	}

	public static void main(String args[]) {
		// static으로 RAM에 미리 올려놨기 때문에 객체를 만들 필요없이 다이렉트로 사용 가능
		println(20);
		println(value);
		
		// 클래스 객체가 만들어져있지 않아도 접근 가능
		System.out.println(Claass.d);
	}

	// 정적 메소드
	public static void println(int a) {
		System.out.println(a);
	}
}

class Claass {

	// 일반 클래스에서는 필드에서 값을 변경할 수 없다
	int a = 10;
	int b = 10;
	int c = 0;

	// c = a + b; -> 오류
	
	static int d = 22;
	
	static {
		d = 33;
	}

}
