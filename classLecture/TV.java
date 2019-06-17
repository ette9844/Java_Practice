package classLecture;

public class TV {

	// �ʵ�
	String maker; // ������
	int inch; // ������
	int price; // ����
	boolean power; // ���� false-off / true-on
	int volume; // ����
	int channel; // ä��

	// ������
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

	// �ż���
	// ���� On/Off
	void powerOn() {
		this.power = true;
		System.out.println("TV On");
	}

	void powerOff() {
		this.power = false;
		System.out.println("TV Off");
	}

	// ���� up
	void volumeUp() {
		if (this.power) {
			if (this.volume < 100) {
				this.volume++;
				System.out.println("���� ����: " + this.volume);
			} else {
				System.out.println("100�� �ִ� �����Դϴ�.");
			}
		}
	}

	// ���� down
	void volumeDown() {
		if (this.power) {
			if (this.volume > 0) {
				this.volume--;
				System.out.println("���� ����: " + this.volume);
			} else {
				System.out.println("���� ������ 0 �Դϴ�");
			}
		}
	}

	// ä�� ����
	void inputChannel(int channel) {
		if (this.power) {
			this.channel = channel;
			System.out.println("���� ä��: " + this.channel);
		}
	}
}
