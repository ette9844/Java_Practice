package homework2;

public class Exercise3_9 {

	public static void main(String[] args) {

		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

		while (tmp != 0) {
			// result의 자릿수를 올림
			result *= 10;
			// tmp의 1의 자릿수를 뽑아 result에 추가
			result += tmp % 10;
			// tmp의 1의 자릿수를 날림
			tmp /= 10;
		}

		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}

}
