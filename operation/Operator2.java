package operation;

// ���� ������
public class Operator2 {
	public static void main (String[] args) {
		int a = 10;
		a ++;
		System.out.println(a);
		System.out.println(a++);	// a print �ϰ� 1 ����
		System.out.println(a);
		
		a = 10;
		++ a;
		System.out.println(a);
		System.out.println(++a); 	// a�� 1�� ���ϰ� print
		
		System.out.println("-------------");
		
		int b = 10;
		b --;
		System.out.println(b);
		System.out.println(b--);	// b print �ϰ� 1 ��
		System.out.println(b);
		
		b = 10;
		-- b;
		System.out.println(b);
		System.out.println(--b); 	// b�� 1�� ���� print
		
		// ex.3
		int c = 10;
		++c; c--; --c; --c; c++;
		System.out.println("-------------");
		System.out.println(++c);	// ����� : 10
		
		c = 0;
		a = 5;
		b = 7;
		c = ++a + b++;	// 13
		System.out.println("-------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
