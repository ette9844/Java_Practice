package nestedClass.nestedInterface;

public class A {

	interface I {
		// 중첩 인터페이스
		public abstract void method();
	}
	
	class B implements I {
		public void method() {
			System.out.println("A.B.method()");
		}
	}

}
