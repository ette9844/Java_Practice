package homework2;

public class Exercise3_9 {

	public static void main(String[] args) {

		int number = 12321;
		int tmp = number;
		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����

		while (tmp != 0) {
			// result�� �ڸ����� �ø�
			result *= 10;
			// tmp�� 1�� �ڸ����� �̾� result�� �߰�
			result += tmp % 10;
			// tmp�� 1�� �ڸ����� ����
			tmp /= 10;
		}

		if (number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}

}
