package referenceType;

public class ArrayEx {

	public static void main(String[] args) {
		// �迭 ��ü ���� int num[] �� ������
		int[] num = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for(int i=0; i<5; i++) {
			sum += num[i];
		}
		
		System.out.println(sum);
	}

}
