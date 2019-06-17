package iterator;

// 06-11 
public class ForWhile {

	public static void main(String[] args) {

		 // for(초기값; 조건; 증감) 
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		 
		 System.out.println(sum);
		 

//		int sum = 0;
		int k = 0;
		{
			// 중괄호 사이에서 생성된 변수는 해당 중괄호 안에서만 접근 가능
//			int k = 0;
		}
		for (; k < 10; k++) {
			System.out.println(k);
		}
		
	}

}
