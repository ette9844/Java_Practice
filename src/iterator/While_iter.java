package iterator;

public class While_iter {

	public static void main(String[] args) {

		while(true) {
			System.out.println("*");
			// while문을 빠져나오는 구문
			break;
		}
		
		// 위 while문과 동일한 코드
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
