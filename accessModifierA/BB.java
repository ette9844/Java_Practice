package accessModifierA;

public class BB {
	public static int valueB = 2;
	
	//CC cc = new CC();		// CC생성자를 pirvate로 만들면 외부 클래스에서는 CC객체를 만들수 없음
	void methodBB() {
		// CC.valueC = 2;
		CC cc = new CC();
		cc.setValue(3);
		
		AA a1 = new AA();
		
		// private 접근 불가 / 같은 패키지라서 default는 접근 가능
		a1.method1();
		a1.method2();		
//		a1.method3();		// (X)
		
		// private 접근 불가, getter로 값 가져오기
		System.out.println(a1.aa1);
		System.out.println(a1.aa2);
		System.out.println(a1.getter());

	}
}


class CC {
	private static int valueC = 4;
	
	public void setValue(int value) {
		valueC = value;
	}
}