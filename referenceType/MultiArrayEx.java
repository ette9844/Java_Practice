package referenceType;

// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25
public class MultiArrayEx {

	public static void main(String[] args) {
		
		// 2차원 배열 생성
		int[][] mArr = new int[5][5];

		int num = 1;
		for (int i = 0; i < mArr.length; i++) {
			if (i % 2 == 0) {
				// i가 짝수일때 순차적으로 채워넣기
				for (int j = 0; j < mArr.length; j++) {
					mArr[i][j] = num;
					num++;
				}
			} else {
				// i가 홀수일때 역순으로 채워넣기
				for (int j = 4; j >= 0; j--) {
					mArr[i][j] = num;
					num++;
				}
			}
		}

		// 2차원 배열 출력
		for (int i = 0; i < mArr.length; i++) {
			for (int j = 0; j < mArr.length; j++) {
				System.out.print(mArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
