package inheritance;

//p308
class A {
	A() {
		System.out.println("A()");
	}

	void methodA() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		System.out.println("B()");
	}

	void methodB() {
		System.out.println("B");
	}

	@Override
	void methodA() {
		System.out.println("BA");
	}
}

class C extends A {
	void methodC() {
		System.out.println("C");
	}
}

class D extends B {
	void methodD() {
		System.out.println("D");
	}
}

class E extends C {
	void methodE() {
		System.out.println("E");
	}
}

public class PromotionEx {

	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		E e = new E();
//		
//		System.out.println();
//		a.methodA();
//		a = b;			// b를 대입함으로서 methodA가 override됨 (자동 형변환)
//		a.methodA();	// override된 B의 methodA가 출력됨
////		a.methodB();	// 오류: class A는 class B의 method는 호출할 수 없다
//		System.out.println();
//		
//		a = c;
//		a.methodA();
//		a = d;
//		a.methodA();
//		a = e;
//		a.methodA();
//		
//		b = d;
//		b.methodA();
//		b.methodB();
//		
//		c = e;
//		c.methodA();
//		c.methodC();
//		
//		// 상속 관계에 있지 않아 컴파일 에러
//		/*
//		b = e;
//		c = d;
//		b = c;
//		*/

//		A a1 = new B();		// 자동 형변환
		A a1 = new C(); // C클래스가 자동형변환 된 a1이기 때문에 에러 발생

		// 위와 같은 상황을 막기 위해 a1의 타입을 확인해야 함
		boolean result = false;
		result = a1 instanceof B; // a1이 B타입의 객체를 가지고 있는지 확인하는 구문
		System.out.println(result);
		
		// 이를 이용해 다음과 같이 예외 처리를 할 수 있다
		if (result) {
			B b1 = (B) a1; // 강제 형변환
			b1.methodA();
			b1.methodB();
		} else {
			System.out.println("강제 형변환을 할 수 없습니다");
		}
	}

}
