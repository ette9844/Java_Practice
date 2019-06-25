package thread;

public class ThreadYieldEx {

	public static void main(String[] args) {

		TargetThread1 t1 = new TargetThread1();
		TargetThread2 t2 = new TargetThread2();

		t1.start();
		t2.start();

		try {
			Thread.sleep(3000);
			System.out.println("3초 경과--------------");
		} catch (InterruptedException e) {
		}
		t2.work = false;

		try {
			Thread.sleep(3000);
			System.out.println("3초 경과--------------");
		} catch (InterruptedException e) {
		}
		t2.work = true;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		t2.stop = true;

	}
}

class StatePrintThread2 extends Thread {
	private Thread targetT;

	StatePrintThread2(Thread targetT) {
		this.targetT = targetT;
	}

	public void run() {
		while (true) {
			Thread.State state = targetT.getState();
			System.out.println(state);

			if (state == Thread.State.NEW) {
				targetT.start();
			}

			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class TargetThread1 extends Thread {
	boolean stop = false;
	boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("t1 작업중");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println("t1 종료");
	}
}

class TargetThread2 extends Thread {
	boolean stop = false;
	boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("t2 작업중");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println("t2 종료");
	}
}
