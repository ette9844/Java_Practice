package homework4;

public class Exercise4_6 {
	public static void main(String args[]) {

		// ū �ݾ��� ������ �켱������ �Ž��� ��� �Ѵ�
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;

		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			// �ݾ��� �ش� �������� Ŭ ���
			if (money / coinUnit[i] > 0) {
				// �ش� �������� ��ȯ������ �ִ� ���� �� ���
				System.out.println(coinUnit[i] + "��: " + money / coinUnit[i]);
				// �ݾ׿��� ��ȯ�� ������ŭ ������ ��(��������)�� �� money�� ��
				money %= coinUnit[i];
			} else if (money == 0) {
				// �ݾ��� ��� ��ȯ�Ǿ��� ���� for���� �������´�
				break;
			}
		}

	}
}
