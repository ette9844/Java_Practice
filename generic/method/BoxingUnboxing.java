package generic.method;

// p523
public class BoxingUnboxing {

	public static void main(String[] args) {

		int a = 10;
		// int의 여러가지 제약을 해결하기 위한 Integer 클래스
		Integer obj1 = new Integer(10);
		Integer obj2 = 10;	// 자동 boxing
		
		// a는 클래스의 객체가 아니기 때문에 기능이 없다
		// Interger 객체로 생성된 obj는 다양한 메서드를 지원한다
		double b = (double) a;
		double c = obj2.doubleValue() + 10.0; // 간편
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(obj1.MAX_VALUE);
		
		Integer num = new Integer("12345");	// 알아서 변환되어 숫자로 들어감
		System.out.println(num);
//		num = "12345";		// 자동 Boxing 오류
		
		int num2 = obj1.valueOf("12345");
		System.out.println(num2);
	}

}