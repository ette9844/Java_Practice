package iterator;

public class Exercise5 {

	public static void main(String[] args) {

		// 10이하 자연수인 x,y의 모든 조합에 대해
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {

				// 방정식을 만족하면 출력
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
