package iterator;

// ±¸±¸´Ü
public class Ex3 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
			}
			System.out.print("\n");
		}
	}

}
