package homework1;

public class Exercise6 {

	public static void main(String[] args) {
		int num = 24;

		System.out.println((num % 10 == 0) ? 0 : ((num / 10) + 1) * 10 - num);
	}
}
