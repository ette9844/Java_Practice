package condition_iteration;

public class IfLottoEx {
	public static void main(String[] args) {
		int num = 0;

		// 1���� 45������ ���ڸ� 6�� ���
		for (int i = 1; i < 7; i++) {
			num = (int) (Math.random() * 45) + 1;
			System.out.println(i + "��° ����: " + num);
		}
	}
}