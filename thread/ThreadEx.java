package thread;

public class ThreadEx {

	public static void main(String[] args) {

		// t1 ������
		Thread t1 = new BeepThread();
		t1.setPriority(Thread.MAX_PRIORITY);	// ���� ���� �켱���� �ο�
		t1.start();

		// t2 ������
		// runnable interface ��ü ����
		Runnable r1 = new BeepThread2();
		// thread class ��ü ����
		Thread t2 = new Thread(r1);
		t2.setPriority(Thread.MIN_PRIORITY);	// ���� ���� �켱���� �ο�
		t2.start();

		// ���� ������
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// ����� t2 �ۼ��ϸ� �켱������ �з��� ���߿� ��

		// �� �����尡 ���� ���� -> ��Ƽ ������
		// �� ������� �������� �۵� (�켱������ �����Ƿ� ����)
		// but �켱������ �ִ� �� ������ ������ Ư�� �����尡 ���� ����Ǵ� ���� �ƴ�
		// �켱���� != 100�ۼ�Ʈ �켱��
	}

}

// Thread class ������� thread class ����
class BeepThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Runnable interface ������� thread class ����
class BeepThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}