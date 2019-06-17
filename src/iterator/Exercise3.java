package iterator;

public class Exercise3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		for (i = 1; i <= 100; i++) {

			// 3의 배수이면 총합 더하기
			if (i % 3 == 0) {
				sum += i;
			}
		}

		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}

		do {
			if (i % 3 == 0) {
				sum += i;
			}
			sum++;
		} while (i <= 1000);

		System.out.println(sum);
	}

}
