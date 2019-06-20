package nestedClass.instanceMemberClass;

public class A {

	A() { System.out.println("A() 객체 생성"); }
	
	// 필드값
	int a;
	static int staticA;
	
	// 클래스 내에서 객체화
	A classA = new A();
	B classB = new B();
	C classC = new C();
//	D classD = new D();		// local class 불가

	static A staticClassA = new A();
//	static B staticClassB = new B();
	static C staticClassC = new C();
//	static D staticClassD = new D();
	
	
	// 메소드
	void methodAA() {
		a = 10;
		staticA = 20;
		
		classA.a = 30;
		classB.b = 40;
		classC.c = 50;
		
		B classBB = new B();
		C classCC = new C();
		
		classB.methodB();
		classC.methodC();
		
		classBB.b = 130;
		classCC.c = 140;
	}
	
	static void methodAAA() {
//		a = 10;					// static 메소드 안에는 static 변수만
		staticA = 20;
		
		staticClassA.a = 110;
		staticClassC.c = 120;
		
//		B classBBB = new B();	// static 메소드 안에서는 B클래스는 만들어지지 않음
		C classCCC = new C();
		classCCC.c = 150;
	}
	
	// 인스턴스 멤버 클래스
	class B {
		B() { System.out.println("A.B() 객체 생성"); }
		
		int b;
//		static int sb;				// static 필드 생성 불가 -> 아직 생성되지 않은 클래스이므로 메모리에 올릴수 x
		void methodB() {}
//		static void methodSB() {}	// static 메소드 생성 불가
	}
	
	// 정적 멤버 클래스
	static class C {
		C() { System.out.println("A.C() 객체 생성"); }
		
		int c;
		static int staticC;
		void methodC() {}
		static void methodStaticC() {}
	}
	
	// 로컬 클래스: 객체 A를 생성하고 methodA가 호출될때만 사용가능
	void methodA() {
		class D {
			D() { System.out.println("A.methodA().D() 객체 생성"); }
			
			int d;
//			static int sd;				// static 필드 생성 불가
			void methodD() {}
//			static void methodSD() {}	// static 메소드 생성 불가
		}
		
		D d = new D();	// 함수 내에서 객체 생성
		d.d = 3;
		d.methodD();
		
		System.out.println(d.d);
	}
}


