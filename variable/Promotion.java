package variable;

public class Promotion {
	public static void main (String [] args) {
		// Ÿ�� ����
		int a = 10;
		int b = 20;
		
		double dbA = 20;
		double dbB = 0;
		
		dbB = dbA + a;	// �ڵ����� �� ��ȯ�� ����
		dbB = dbA + (double) a;		// ��������� �� ��ȯ
		// 20.0 + 10.0
		System.out.println(dbB);
		
		b = (int) dbB;	// double���� int������ �� ��ȯ
		System.out.println(b);
		// ���� Ÿ�� �� ��ȯ�� �ǵ��� ���ϴ� ���� ����
		// ���ٸ� �ѹ� ���� �ٽ� �ǵ��������� �Ѵ�
		
		//sysout ���� ctrl+�����̽��� ������ �ڵ��ϼ����� println()�� �ϼ���
		System.out.println("sysout + ctrl + space");
	}
}
