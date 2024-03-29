package interfaces;

// p387 5번
// 익명 구현 객체 예제
interface Action {
	void work();
}

public class ActionEx {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다");
			}
		};
		
		action.work();
	}

}
