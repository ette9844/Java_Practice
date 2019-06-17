package homework4;

public class Exercise4_6 {
	public static void main(String args[]) {

		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;

		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			// 금액이 해당 동전보다 클 경우
			if (money / coinUnit[i] > 0) {
				// 해당 동전으로 반환가능한 최대 동전 수 출력
				System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
				// 금액에서 반환한 동전만큼 차감된 값(나머지값)을 새 money로 함
				money %= coinUnit[i];
			} else if (money == 0) {
				// 금액이 모두 반환되었을 때는 for문을 빠져나온다
				break;
			}
		}

	}
}
