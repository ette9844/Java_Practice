package homework2;

public class Exercise3_2 {

	public static void main(String[] args) {

		int sum = 0;

		// 1~20까지의 정수 중에
		for (int i = 1; i <= 20; i++) {
			// 2또는 3의 배수가 아닌 수를 총합에 더함
			if ((i % 2 != 0) && (i % 3 != 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
