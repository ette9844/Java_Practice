package iterator;

// 06-11 
public class ForWhile {

	public static void main(String[] args) {

		 // for(�ʱⰪ; ����; ����) 
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		 
		 System.out.println(sum);
		 

//		int sum = 0;
		int k = 0;
		{
			// �߰�ȣ ���̿��� ������ ������ �ش� �߰�ȣ �ȿ����� ���� ����
//			int k = 0;
		}
		for (; k < 10; k++) {
			System.out.println(k);
		}
		
	}

}
