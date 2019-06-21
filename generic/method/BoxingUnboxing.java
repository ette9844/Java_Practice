package generic.method;

// p523
public class BoxingUnboxing {

	public static void main(String[] args) {

		int a = 10;
		// int�� �������� ������ �ذ��ϱ� ���� Integer Ŭ����
		Integer obj1 = new Integer(10);
		Integer obj2 = 10;	// �ڵ� boxing
		
		// a�� Ŭ������ ��ü�� �ƴϱ� ������ ����� ����
		// Interger ��ü�� ������ obj�� �پ��� �޼��带 �����Ѵ�
		double b = (double) a;
		double c = obj2.doubleValue() + 10.0; // ����
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(obj1.MAX_VALUE);
		
		Integer num = new Integer("12345");	// �˾Ƽ� ��ȯ�Ǿ� ���ڷ� ��
		System.out.println(num);
//		num = "12345";		// �ڵ� Boxing ����
		
		int num2 = obj1.valueOf("12345");
		System.out.println(num2);
	}

}