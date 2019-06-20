package homework9;

// 같은 패키지에 같은 클래스가 있어 클래스명 변경
class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		Outer2.Inner inner = new Outer2.Inner();
		
		System.out.println(inner.iv);
	}

}
