package iterator;

// ���ڸ� ���
public class Ex5 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 5-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}