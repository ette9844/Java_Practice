package iterator;


// for/while/do-while
public class Exercise4 {

	public static void main(String[] args) {

		int dice1 = 0;
		int dice2 = 0;

		// ���� ���� 5�� �ɶ����� �ݺ�
		for(;dice1 + dice2 != 5;) {

			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}
	}

}
