package classLecture;

public class Car {

	// 필드값만 들어간다. 명령만 들어가는 공간
	String company = "현대자동차";
	String master = "hyejin";
	char mode; // D 운행 / B 급가속 / N 일반
	int speed;
	int gas;
	int maxSpeed;
	boolean power = false;

	// 생성자: 다른 함수와는 달리 output 값이 없다
	Car() {
		// 기본 생성자
		maxSpeed = 200;
		speed = 0;
		gas = 100;
	}

	Car(String master) {
		this(); // 기본 생성자 호출
		if (master == this.master) {
			System.out.println("안녕하세요. " + master + "님");
			power = true;
		}
	}

	// 메소드: 가속
	void accel() {
		if (power) {
			if (speed != maxSpeed && gas - 10 > 0) {
				System.out.println("가속하였습니다");

				speed += 10;
				if (speed > maxSpeed)
					speed = maxSpeed;

				gas -= 10;
			} else if (gas - 10 <= 0) {
				speed = 0;
				gas = 0;
			}

			printSG();
		}
	}

	// 메소드: 감속
	void brake() {
		if (power) {
			if (speed != 0) {
				speed -= 20;
				System.out.println("감속하였습니다");
			}

			if (speed - 20 < 0) {
				speed = 0;
			}

			printSG();
		}
	}

	// 메소드: 속력/가스 출력
	void printSG() {
		if (speed == maxSpeed)
			System.out.println("현재 최대 속도입니다");
		if (gas == 0)
			System.out.println("가스가 떨어졌습니다");
		if (speed == 0)
			System.out.println("차량이 정지하였습니다");

		System.out.println("현재 속도: " + speed);
		System.out.println("가스 잔량: " + gas);
		System.out.println();

		return;
	}

	// 메소드: 기어 변속 (N -> D -> B)
	void transfer(char mode) {
		if (power) {
			if((this.mode - mode) == ('N' - 'B') || (this.mode - mode) == ('B' - 'N'))
				System.out.println("기어변속을 할 수 없습니다");
			else
				this.mode = mode;
		} else if(!power) {
			System.out.println("기어변속을 할 수 없습니다");
			System.out.println("차주 권한으로 접속해주세요");
		}
	}

	// 메소드: 부스터 / 5초 동안 속도를 300km로
	void booster() {
		if (power && mode == 'B') {
			speed = 300;
			gas -= 20;
			System.out.println("부스터 온");

			for (int i = 1; i <= 5; i++) {
				// 스레드가 제대로 작동하지 않을 경우 예외 처리
				try {
					Thread.sleep(1000); // 1000 = 1초
					System.out.println("부스터: " + i + "초");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// 부스터 오프
			System.out.println("부스터 오프");
			speed = maxSpeed;
			printSG();
		} else {
			System.out.println("부스터를 작동할 수 없습니다");
		}
	}
}
