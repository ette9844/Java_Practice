package condition_iteration;

public class IfLottoEx {
	public static void main(String[] args) {
		int num = 0;

		// 1부터 45사이의 숫자를 6개 출력
		for (int i = 1; i < 7; i++) {
			num = (int) (Math.random() * 45) + 1;
			System.out.println(i + "번째 숫자: " + num);
		}
	}
}