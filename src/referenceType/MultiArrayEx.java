package referenceType;

// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25
public class MultiArrayEx {

	public static void main(String[] args) {
		
		// 2���� �迭 ����
		int[][] mArr = new int[5][5];

		int num = 1;
		for (int i = 0; i < mArr.length; i++) {
			if (i % 2 == 0) {
				// i�� ¦���϶� ���������� ä���ֱ�
				for (int j = 0; j < mArr.length; j++) {
					mArr[i][j] = num;
					num++;
				}
			} else {
				// i�� Ȧ���϶� �������� ä���ֱ�
				for (int j = 4; j >= 0; j--) {
					mArr[i][j] = num;
					num++;
				}
			}
		}

		// 2���� �迭 ���
		for (int i = 0; i < mArr.length; i++) {
			for (int j = 0; j < mArr.length; j++) {
				System.out.print(mArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
