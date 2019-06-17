package classLecture;

public class TV {

	// 필드
	String maker; // 제조사
	int inch; // 사이즈
	int price; // 가격
	boolean power; // 전원 false-off / true-on
	int volume; // 볼륨
	int channel; // 채널

	// 생성자
	TV() {
		this.inch = 65;
		this.price = 1000000;
		this.volume = 0;
		this.channel = 0;
		this.power = false;
	}

	TV(String maker) {
		this.maker = maker;

		this.inch = 65;
		this.price = 1000000;
		this.volume = 0;
		this.channel = 0;
		this.power = false;
	}

	// 매서드
	// 전원 On/Off
	void powerOn() {
		this.power = true;
		System.out.println("TV On");
	}

	void powerOff() {
		this.power = false;
		System.out.println("TV Off");
	}

	// 볼륨 up
	void volumeUp() {
		if (this.power) {
			if (this.volume < 100) {
				this.volume++;
				System.out.println("현재 볼륨: " + this.volume);
			} else {
				System.out.println("100은 최대 볼륨입니다.");
			}
		}
	}

	// 볼륨 down
	void volumeDown() {
		if (this.power) {
			if (this.volume > 0) {
				this.volume--;
				System.out.println("현재 볼륨: " + this.volume);
			} else {
				System.out.println("현재 볼륨은 0 입니다");
			}
		}
	}

	// 채널 변경
	void inputChannel(int channel) {
		if (this.power) {
			this.channel = channel;
			System.out.println("현재 채널: " + this.channel);
		}
	}
}
