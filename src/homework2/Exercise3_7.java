package homework2;

public class Exercise3_7 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		do {
			// num�� 1�� �ڸ����� �̾� �� ��
			sum += num%10;
			// num�� 1�� �ڸ����� ����
			num /= 10;
		} while(num != 0);
		// num�� ���̻� ���� �ڸ����� �������� ������ ���� �ݺ�
		
		System.out.println("sum = " + sum);
	}

}
