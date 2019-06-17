package iterator;

// 구구단에서 대각선 날리기
public class Ex4 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				
				if (j == i + 1) {
					System.out.print("\t\t");
				} else {
					System.out.print(j + " x " + i + " = " + (i * j) + "\t");
				}
			}
			System.out.print("\n");
		}
	}

}
