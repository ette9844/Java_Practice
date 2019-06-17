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
//		a = b;			// b�� ���������μ� methodA�� override�� (�ڵ� ����ȯ)
//		a.methodA();	// override�� B�� methodA�� ��µ�
////		a.methodB();	// ����: class A�� class B�� method�� ȣ���� �� ����
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
//		// ��� ���迡 ���� �ʾ� ������ ����
//		/*
//		b = e;
//		c = d;
//		b = c;
//		*/

//		A a1 = new B();		// �ڵ� ����ȯ
		A a1 = new C(); // CŬ������ �ڵ�����ȯ �� a1�̱� ������ ���� �߻�

		// ���� ���� ��Ȳ�� ���� ���� a1�� Ÿ���� Ȯ���ؾ� ��
		boolean result = false;
		result = a1 instanceof B; // a1�� BŸ���� ��ü�� ������ �ִ��� Ȯ���ϴ� ����
		System.out.println(result);
		
		// �̸� �̿��� ������ ���� ���� ó���� �� �� �ִ�
		if (result) {
			B b1 = (B) a1; // ���� ����ȯ
			b1.methodA();
			b1.methodB();
		} else {
			System.out.println("���� ����ȯ�� �� �� �����ϴ�");
		}
	}

}
