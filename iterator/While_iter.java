package iterator;

public class While_iter {

	public static void main(String[] args) {

		while(true) {
			System.out.println("*");
			// while���� ���������� ����
			break;
		}
		
		// �� while���� ������ �ڵ�
		for(;(true);) {
			System.out.println("%");
			break;
		}
		
		// do ~ while
		do {
			System.out.println("*");
			break;
		} while (true);
	}

}
