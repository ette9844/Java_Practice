package iterator;

// 1~100 ���� �߿� �Ҽ��� ������������ ����Ͻÿ�
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
