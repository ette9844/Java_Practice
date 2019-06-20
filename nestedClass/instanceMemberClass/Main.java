package nestedClass.instanceMemberClass;

public class Main {
	public static void main(String[] args) {
		
		A a = new A();		// (선행)
		A.B b = a.new B();	// A객체가 생성되어야 B객체 생성 가능 (후행)
		
		b.b = 3;
		b.methodB();
		
		A.C c= new A.C();	// 바로 객체화 가능
		c.c = 4;
		c.staticC = 5;
		c.methodC();
		c.methodStaticC();
		
		System.out.println(c.c);
		System.out.println(c.staticC);
		
		a.methodA();		// methodA가 호출되면서 클래스 D가 생성됨
//		System.out.println(d.d);	
		// 함수 외에서 접근 불가
		// methodA가 리턴되면서 메모리에서 삭제 되어 D접근 불가 (heap에는 생성되어있음)
		
	}
}
