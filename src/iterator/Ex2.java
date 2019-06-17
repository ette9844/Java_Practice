package iterator;

// 1~100 숫자 중에 소수만 내림차순으로 출력하시오
public class Ex2 {

	public static void main(String[] args) {

		int count = 0;
		int j = 0;

		for (int i = 100; i > 1; i--) {

			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}

			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}

			if (j == i) {
				System.out.print(i + "\t");
				count++;
			}
		}
	}

}
