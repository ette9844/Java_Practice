package homework2;

public class Exercise3_2 {

	public static void main(String[] args) {

		int sum = 0;

		// 1~20������ ���� �߿�
		for (int i = 1; i <= 20; i++) {
			// 2�Ǵ� 3�� ����� �ƴ� ���� ���տ� ����
			if ((i % 2 != 0) && (i % 3 != 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
