package homework2;

public class Exercise3_8 {

	public static void main(String[] args) {
		// Fibonacci ������ ������ ù �� ���ڸ� 1, 1�� �Ѵ�
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // ����° ��

		System.out.print(num1 + "," + num2);
		for(int i=0; i<8; i++) {
			// ���� Fibonacci �� ���/���
			num3 = num1 + num2;
			System.out.print(","+num3);
			
			// num1, num2 ����
			num1 = num2;
			num2 = num3;
		}
	}

}
