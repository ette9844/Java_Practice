package accessModifierA;

public class BB {
	public static int valueB = 2;
	
	//CC cc = new CC();		// CC�����ڸ� pirvate�� ����� �ܺ� Ŭ���������� CC��ü�� ����� ����
	void methodBB() {
		// CC.valueC = 2;
		CC cc = new CC();
		cc.setValue(3);
		
		AA a1 = new AA();
		
		// private ���� �Ұ� / ���� ��Ű���� default�� ���� ����
		a1.method1();
		a1.method2();		
//		a1.method3();		// (X)
		
		// private ���� �Ұ�, getter�� �� ��������
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