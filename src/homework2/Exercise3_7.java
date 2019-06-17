package homework2;

public class Exercise3_7 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		do {
			// num의 1의 자릿수를 뽑아 더 함
			sum += num%10;
			// num의 1의 자릿수를 날림
			num /= 10;
		} while(num != 0);
		// num에 더이상 더할 자릿수가 남아있지 않을때 까지 반복
		
		System.out.println("sum = " + sum);
	}

}
