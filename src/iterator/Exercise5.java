package iterator;

public class Exercise5 {

	public static void main(String[] args) {

		// 10���� �ڿ����� x,y�� ��� ���տ� ����
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {

				// �������� �����ϸ� ���
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
