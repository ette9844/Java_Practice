package operation;

// 증감 연산자
public class Operator2 {
	public static void main (String[] args) {
		int a = 10;
		a ++;
		System.out.println(a);
		System.out.println(a++);	// a print 하고 1 더함
		System.out.println(a);
		
		a = 10;
		++ a;
		System.out.println(a);
		System.out.println(++a); 	// a에 1을 더하고 print
		
		System.out.println("-------------");
		
		int b = 10;
		b --;
		System.out.println(b);
		System.out.println(b--);	// b print 하고 1 뺌
		System.out.println(b);
		
		b = 10;
		-- b;
		System.out.println(b);
		System.out.println(--b); 	// b에 1을 빼고 print
		
		// ex.3
		int c = 10;
		++c; c--; --c; --c; c++;
		System.out.println("-------------");
		System.out.println(++c);	// 결과값 : 10
		
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
