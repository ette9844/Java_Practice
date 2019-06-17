package iterator;

// 1~100 숫자 중에 3의 배수와 5의 배수 출력하시오
// 겹치는 부분은 제외하시오
public class Ex1 {

	public static void main(String[] args) {
		
		int count = 0;

		// ex.1
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 || i % 5 == 0) {
				// println은 괄호 내용을 출력하고 자동으로 줄 바꿈 하는 함수
				System.out.print(i + "\t");
				count++;
			}
			
			// 10개씩 끊어 보기 좋게 출력
			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}
		}
	}

}
