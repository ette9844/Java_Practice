package generic.method;

public class CompareMethodEx {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "오렌지");
		
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if (result1 == true) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		Pair<String, String> p3 = new Pair<>("user1","hong");
		Pair<String, String> p4 = new Pair<>("user1","hong");
		
		boolean result2 = Util.compare(p3, p4);
		if (result1 == true) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		int result3 = Util.compare(10, 20);
		if(result3 == 0)
			System.out.println("같습니다");
		else if(result3 > 0)
			System.out.println("앞의 값이 더 큽니다");
		else
			System.out.println("뒤엣 값이 더 큽니다");
		

		// 숫자가 들어오게끔 강제했기 때문에 문자열을 입력하면 컴파일 에러
//		int result4 = Util.compare("10", "20");
	}

}
