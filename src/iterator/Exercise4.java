package iterator;


// for/while/do-while
public class Exercise4 {

	public static void main(String[] args) {

		int dice1 = 0;
		int dice2 = 0;

		// 눈의 합이 5가 될때까지 반복
		for(;dice1 + dice2 != 5;) {

			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}
	}

}
