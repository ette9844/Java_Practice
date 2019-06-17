package operation;

// 논리 연산자, 비교 연산자
public class Operator3 {
	public static void main(String[] args) {
		// boolean
		boolean bool = false;
		System.out.println(bool);
		System.out.println(!bool);
		
		System.out.println("------------");
		
		// 비교 연산자
		boolean result;
		result = 100 > 20;	// true
		System.out.println(result);
		
		result = 100 < 20;	// false
		System.out.println(result);
		
		int d = 20;
		int e = 30;
		result = d >= e;	// false
		System.out.println(result + " " + d + " " + e);
		
		result = d <= e;	// true
		System.out.println(result);
		
		result = d != e;	// true
		System.out.println(result);
		
		result = d == e;	// false
		System.out.println(result);
		
		
		// 논리 연산자
		// && (AND) || (OR) ! (NOT) ^ (XOR)
		
		System.out.println("------------");
		
		// 삼항 연산자
		e = 50;
		int f;
		f = (e == 50) ? 100 : 200;
		System.out.println(f);
		f = (e != 50) ? 100 : 200;
		System.out.println(f);
	}
}
