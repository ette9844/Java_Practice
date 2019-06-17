package operation;

// �� ������, �� ������
public class Operator3 {
	public static void main(String[] args) {
		// boolean
		boolean bool = false;
		System.out.println(bool);
		System.out.println(!bool);
		
		System.out.println("------------");
		
		// �� ������
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
		
		
		// �� ������
		// && (AND) || (OR) ! (NOT) ^ (XOR)
		
		System.out.println("------------");
		
		// ���� ������
		e = 50;
		int f;
		f = (e == 50) ? 100 : 200;
		System.out.println(f);
		f = (e != 50) ? 100 : 200;
		System.out.println(f);
	}
}
