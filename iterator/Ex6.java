package iterator;

// 별 그리기 2
public class Ex6 {

	public static void main(String[] args) {
		// i는 1부터 3까지
		for (int i = 1; i < 4; i++) {
			// 4-i만큼 빈칸 찍기
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			// i만큼 * 찍기
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println();
		}
		
		// * 4개 찍기
		System.out.println("****");
		
		// i는 1부터 3까지
		for (int i = 1; i < 4; i++) {
			// 4-i만큼 * 찍기
			for (int j = 4-i; j > 0; j--) {
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println();
		}
	}

}
