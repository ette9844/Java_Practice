package nestedClass.instanceMemberClass;

public class A {

	A() { System.out.println("A() ��ü ����"); }
	
	// �ʵ尪
	int a;
	static int staticA;
	
	// Ŭ���� ������ ��üȭ
	A classA = new A();
	B classB = new B();
	C classC = new C();
//	D classD = new D();		// local class �Ұ�

	static A staticClassA = new A();
//	static B staticClassB = new B();
	static C staticClassC = new C();
//	static D staticClassD = new D();
	
	
	// �޼ҵ�
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
//		a = 10;					// static �޼ҵ� �ȿ��� static ������
		staticA = 20;
		
		staticClassA.a = 110;
		staticClassC.c = 120;
		
//		B classBBB = new B();	// static �޼ҵ� �ȿ����� BŬ������ ��������� ����
		C classCCC = new C();
		classCCC.c = 150;
	}
	
	// �ν��Ͻ� ��� Ŭ����
	class B {
		B() { System.out.println("A.B() ��ü ����"); }
		
		int b;
//		static int sb;				// static �ʵ� ���� �Ұ� -> ���� �������� ���� Ŭ�����̹Ƿ� �޸𸮿� �ø��� x
		void methodB() {}
//		static void methodSB() {}	// static �޼ҵ� ���� �Ұ�
	}
	
	// ���� ��� Ŭ����
	static class C {
		C() { System.out.println("A.C() ��ü ����"); }
		
		int c;
		static int staticC;
		void methodC() {}
		static void methodStaticC() {}
	}
	
	// ���� Ŭ����: ��ü A�� �����ϰ� methodA�� ȣ��ɶ��� ��밡��
	void methodA() {
		class D {
			D() { System.out.println("A.methodA().D() ��ü ����"); }
			
			int d;
//			static int sd;				// static �ʵ� ���� �Ұ�
			void methodD() {}
//			static void methodSD() {}	// static �޼ҵ� ���� �Ұ�
		}
		
		D d = new D();	// �Լ� ������ ��ü ����
		d.d = 3;
		d.methodD();
		
		System.out.println(d.d);
	}
}


