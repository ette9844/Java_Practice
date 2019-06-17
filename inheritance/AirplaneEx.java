package inheritance;

// class 앞에 final을 붙이면 override(덮어쓰기, 수정)가 안됨 = 상속이 되지 않는다
/*final*/ class Airplane {

	public void land() {
		System.out.println("착륙");
	}

	// 함수 앞에 final을 붙이면 해당 함수의 override(덮어쓰기, 수정)가 안됨
	public /*final*/ void fly() {
		System.out.println("일반 비행");
	}

	public void takeoff() {
		System.out.println("이륙");
	}
}

class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행");
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