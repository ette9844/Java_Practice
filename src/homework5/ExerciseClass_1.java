package homework5;

public class ExerciseClass_1 {

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };

		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열

		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}

	static int max(int[] arr) {

		// 입력값이 null인 경우
		if (arr == null || arr.length == 0)
			return -999999;

		// 배열 중 최댓값 찾기
		int i = 1;
		int max = arr[0];

		while (i < arr.length) {
			if (max < arr[i])
				max = arr[i];
			i++;
		}

		return max;
	}

	static int abs(int value) {
		if (value < 0)
			return value * -1;
		else
			return value;
	}

}
