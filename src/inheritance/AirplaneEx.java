package inheritance;

// class �տ� final�� ���̸� override(�����, ����)�� �ȵ� = ����� ���� �ʴ´�
/*final*/ class Airplane {

	public void land() {
		System.out.println("����");
	}

	// �Լ� �տ� final�� ���̸� �ش� �Լ��� override(�����, ����)�� �ȵ�
	public /*final*/ void fly() {
		System.out.println("�Ϲ� ����");
	}

	public void takeoff() {
		System.out.println("�̷�");
	}
}

class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("������ ����");
		} else {
			super.fly();
		}
	}
}

public class AirplaneEx {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}
}