package iterator;

// �� �׸��� 2
public class Ex6 {

	public static void main(String[] args) {
		// i�� 1���� 3����
		for (int i = 1; i < 4; i++) {
			// 4-i��ŭ ��ĭ ���
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			// i��ŭ * ���
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// �� �ٲ�
			System.out.println();
		}
		
		// * 4�� ���
		System.out.println("****");
		
		// i�� 1���� 3����
		for (int i = 1; i < 4; i++) {
			// 4-i��ŭ * ���
			for (int j = 4-i; j > 0; j--) {
				System.out.print("*");
			}
			// �� �ٲ�
			System.out.println();
		}
	}

}
