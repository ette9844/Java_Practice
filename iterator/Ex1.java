package iterator;

// 1~100 ���� �߿� 3�� ����� 5�� ��� ����Ͻÿ�
// ��ġ�� �κ��� �����Ͻÿ�
public class Ex1 {

	public static void main(String[] args) {
		
		int count = 0;

		// ex.1
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 || i % 5 == 0) {
				// println�� ��ȣ ������ ����ϰ� �ڵ����� �� �ٲ� �ϴ� �Լ�
				System.out.print(i + "\t");
				count++;
			}
			
			// 10���� ���� ���� ���� ���
			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}
		}
	}

}
