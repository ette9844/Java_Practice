package thread;

public class ThreadStateEx {

	public static void main(String[] args) {
		
		// NEW
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
	}

}

class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) {
			// ������ ���� ���
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);

			// ��ü ���� ������ ��� ���� ��� ���·� ����
			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			// ���� ������ ��� while�� ����
			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class TargetThread extends Thread {
	public void run() {
		for (long i = 0; i < 1000000000; i++) {
			int a = 10;
			a += 10;
		}
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {	}

		for (long i = 0; i < 1000000000; i++) {
			int a = 10;
		}
	}
}