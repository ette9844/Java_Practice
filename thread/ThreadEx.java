package thread;

public class ThreadEx {

	public static void main(String[] args) {

		// t1 스레드
		Thread t1 = new BeepThread();
		t1.setPriority(Thread.MAX_PRIORITY);	// 가장 높은 우선순위 부여
		t1.start();

		// t2 스레드
		// runnable interface 객체 생성
		Runnable r1 = new BeepThread2();
		// thread class 객체 생성
		Thread t2 = new Thread(r1);
		t2.setPriority(Thread.MIN_PRIORITY);	// 가장 낮은 우선순위 부여
		t2.start();

		// 메인 스레드
		for (int i = 0; i < 10; i++) {
			System.out.println("호");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 여기다 t2 작성하면 우선순위에 밀려서 나중에 뜸

		// 세 스레드가 같이 동작 -> 멀티 스레드
		// 세 스레드는 순서없이 작동 (우선순위가 같으므로 랜덤)
		// but 우선순위가 있는 것 뿐이지 무조건 특정 스레드가 먼저 실행되는 것이 아님
		// 우선순위 != 100퍼센트 우선권
	}

}

// Thread class 상속으로 thread class 생성
class BeepThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("야");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Runnable interface 상속으로 thread class 생성
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