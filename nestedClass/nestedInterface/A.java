package nestedClass.nestedInterface;

public class A {

	interface I {
		// ��ø �������̽�
		public abstract void method();
	}
	
	class B implements I {
		public void method() {
			System.out.println("A.B.method()");
		}
	}

}
