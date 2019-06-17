package referenceType;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 60, 50 };
		int temp;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println();

		// 내림차순 정렬 하기
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
