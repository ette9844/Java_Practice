package interfaces;

// p387 5��
// �͸� ���� ��ü ����
interface Action {
	void work();
}

public class ActionEx {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
		};
		
		action.work();
	}

}