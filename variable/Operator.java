package variable;

// 복합 연산자
public class Operator {
	public static void main(String [] args) {
		int a = 10;
		a += 5;		// 복합된 연산자: a = a + 5;
		System.out.println(a);
		
		a -= 5;
		System.out.println(a);
		
		a *= 5;	
		System.out.println(a);
		
		a /= 5;
		System.out.println(a);
		
		a %= 7;	
		System.out.println(a);
	}
}
