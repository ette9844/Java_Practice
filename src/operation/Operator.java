package operation;

// ��Ģ ������
public class Operator {
	public static void main (String[] args) {
		int b = 1;
		b = b + 1;
		b += 1;		// ���� ������
		b ++;		// ���� ������
		b--;
		
		// ex.1
		int num = 365;
		int p100;
		int p10;
		int p1;
		
		p100 = num / 100;
		p10	 = num % 100 / 10;
		p1   = num % 10;
		System.out.println("p100 = " + p100);
		System.out.println("p10  = " + p10);
		System.out.println("p1   = " + p1);
		
		// ex.2
		// F <- ���� �µ� 20C
		double fer;
		double cel = 20;
		
		fer = (cel * 1.8) + 32;
		System.out.println("Celcius   = " + cel + "��C");
		System.out.println("Ferenheit = " + fer + "��F");
		
		System.out.println(9/5); 	// ����: int�� ����ȯ �Ǿ 1.8�� �ȳ���
		fer = cel*((9*1000)/5) + 32000; 	// ���� 1000 ���ؼ� ����ϱ�
		System.out.println(fer/1000);  		// 1000�� ���� -> ������ �ݿø� ���� �ʰ� ����
		
		// �̷��� ��Ȯ�� ����� ���ؼ��� ������ ����� �ؾ��Ѵ�
		// �Ǽ� ���� ����� ����������� �ݿø��� �ϱ� ������ ������ �����
	}
}
