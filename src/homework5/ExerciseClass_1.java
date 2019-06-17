package homework5;

public class ExerciseClass_1 {

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };

		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:" + max(data));
		System.out.println("�ִ밪:" + max(null));
		System.out.println("�ִ밪:" + max(new int[] {})); // ũ�Ⱑ 0�� �迭

		int value = 5;
		System.out.println(value + "�� ���밪:" + abs(value));
		value = -10;
		System.out.println(value + "�� ���밪:" + abs(value));
	}

	static int max(int[] arr) {

		// �Է°��� null�� ���
		if (arr == null || arr.length == 0)
			return -999999;

		// �迭 �� �ִ� ã��
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
