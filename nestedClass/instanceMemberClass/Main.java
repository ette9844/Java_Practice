package nestedClass.instanceMemberClass;

public class Main {
	public static void main(String[] args) {
		
		A a = new A();		// (����)
		A.B b = a.new B();	// A��ü�� �����Ǿ�� B��ü ���� ���� (����)
		
		b.b = 3;
		b.methodB();
		
		A.C c= new A.C();	// �ٷ� ��üȭ ����
		c.c = 4;
		c.staticC = 5;
		c.methodC();
		c.methodStaticC();
		
		System.out.println(c.c);
		System.out.println(c.staticC);
		
		a.methodA();		// methodA�� ȣ��Ǹ鼭 Ŭ���� D�� ������
//		System.out.println(d.d);	
		// �Լ� �ܿ��� ���� �Ұ�
		// methodA�� ���ϵǸ鼭 �޸𸮿��� ���� �Ǿ� D���� �Ұ� (heap���� �����Ǿ�����)
		
	}
}
