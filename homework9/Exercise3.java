package homework9;

// ���� ��Ű���� ���� Ŭ������ �־� Ŭ������ ����
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
