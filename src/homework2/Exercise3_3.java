package homework2;

public class Exercise3_3 {

	public static void main(String[] args) {

		int sum = 0;
		// 1*10 + 2*9 + 3*8 + ... + 10*1
		for (int i = 1; i <= 10; i++) {
			sum += i * (10 - i + 1);
		}
		
		System.out.println(sum);
	}

}
