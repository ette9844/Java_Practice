package classLecture;

public class Car {

	// �ʵ尪�� ����. ��ɸ� ���� ����
	String company = "�����ڵ���";
	String master = "hyejin";
	char mode; // D ���� / B �ް��� / N �Ϲ�
	int speed;
	int gas;
	int maxSpeed;
	boolean power = false;

	// ������: �ٸ� �Լ��ʹ� �޸� output ���� ����
	Car() {
		// �⺻ ������
		maxSpeed = 200;
		speed = 0;
		gas = 100;
	}

	Car(String master) {
		this(); // �⺻ ������ ȣ��
		if (master == this.master) {
			System.out.println("�ȳ��ϼ���. " + master + "��");
			power = true;
		}
	}

	// �޼ҵ�: ����
	void accel() {
		if (power) {
			if (speed != maxSpeed && gas - 10 > 0) {
				System.out.println("�����Ͽ����ϴ�");

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

	// �޼ҵ�: ����
	void brake() {
		if (power) {
			if (speed != 0) {
				speed -= 20;
				System.out.println("�����Ͽ����ϴ�");
			}

			if (speed - 20 < 0) {
				speed = 0;
			}

			printSG();
		}
	}

	// �޼ҵ�: �ӷ�/���� ���
	void printSG() {
		if (speed == maxSpeed)
			System.out.println("���� �ִ� �ӵ��Դϴ�");
		if (gas == 0)
			System.out.println("������ ���������ϴ�");
		if (speed == 0)
			System.out.println("������ �����Ͽ����ϴ�");

		System.out.println("���� �ӵ�: " + speed);
		System.out.println("���� �ܷ�: " + gas);
		System.out.println();

		return;
	}

	// �޼ҵ�: ��� ���� (N -> D -> B)
	void transfer(char mode) {
		if (power) {
			if((this.mode - mode) == ('N' - 'B') || (this.mode - mode) == ('B' - 'N'))
				System.out.println("������ �� �� �����ϴ�");
			else
				this.mode = mode;
		} else if(!power) {
			System.out.println("������ �� �� �����ϴ�");
			System.out.println("���� �������� �������ּ���");
		}
	}

	// �޼ҵ�: �ν��� / 5�� ���� �ӵ��� 300km��
	void booster() {
		if (power && mode == 'B') {
			speed = 300;
			gas -= 20;
			System.out.println("�ν��� ��");

			for (int i = 1; i <= 5; i++) {
				// �����尡 ����� �۵����� ���� ��� ���� ó��
				try {
					Thread.sleep(1000); // 1000 = 1��
					System.out.println("�ν���: " + i + "��");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// �ν��� ����
			System.out.println("�ν��� ����");
			speed = maxSpeed;
			printSG();
		} else {
			System.out.println("�ν��͸� �۵��� �� �����ϴ�");
		}
	}
}
